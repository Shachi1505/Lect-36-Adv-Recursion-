import java.util.Arrays;
import java.util.Scanner;

public class Retry {
    public static void printSubstrings(String s, int n, int index, String curr) {
        if (index == n) {
            return;
        }
        System.out.println(curr);
        for (int i = index + 1; i < n; i++) {
            curr += s.charAt(i);
            printSubstrings(s, n, i, curr);
            curr = curr.substring(0, curr.length() - 1);
        }
    }

    public static String sort(String str) {
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        str = sort(str);
        printSubstrings(str, str.length(), -1, "");
    }
}
