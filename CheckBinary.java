import java.util.Scanner;

public class CheckBinary {
    static class GfG {
        boolean isBinary(String str) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String a = sc.next();
        System.out.println("The output is:");
        GfG gfg = new GfG();
        boolean result = gfg.isBinary(a);
        System.out.println(result ? "The string is binary" : "The string is not binary");
    }
}
