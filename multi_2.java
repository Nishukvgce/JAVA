import java.math.BigInteger;
import java.util.Scanner;

public class multi_2{
    static class Solution {
        public String multiplyStrings(String s1, String s2) {
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            BigInteger mul = a.multiply(b);
            return mul.toString();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number as a string:");
        String S1 = sc.nextLine();
        System.out.println("Enter the second number as a string:");
        String S2 = sc.nextLine();

        Solution solution = new Solution();
        String result = solution.multiplyStrings(S1, S2);
        System.out.println("The result of multiplication is: " + result);
    }
}
