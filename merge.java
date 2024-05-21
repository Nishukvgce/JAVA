import java.util.Scanner;

public class merge {
    class Solution {
        String merge(String S1, String S2) {
            String s3 = "";
            int d = S1.length();
            if (S1.length() < S2.length()) {
                d = S2.length();
            }
            for (int i = 0; i < d; i++) {
                if (i <= S1.length() - 1) {
                    s3 += S1.charAt(i);
                }
                if (i <= S2.length() - 1) {
                    s3 += S2.charAt(i);
                }
            }
            return s3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String S1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String S2 = sc.nextLine();

        merge outerClass = new merge();
        Solution s = outerClass.new Solution();
        String result = s.merge(S1, S2);
        System.out.println("Merged String: " + result);
    }
}
