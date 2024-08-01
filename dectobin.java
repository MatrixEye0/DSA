import java.util.*;

@SuppressWarnings("unused")
public class dectobin{

    // Declare binnum as a class-level variable
    static int binnum = 0;

    public static int dectoobin(int a) {
        int pow = 0;
        while (a > 0) {
            int rem = a % 2;
            binnum = binnum + (rem * (int) Math.pow(10, pow));
            pow++;
            a = a / 2;
        }
        // Return the calculated binary value
        return binnum;
    }

    public static void main(String[] args) {
        // Reset binnum to 0
        binnum = 0;
        
        // Assign the result of dectobin to a variable
        int result = dectoobin(78);
        System.out.println(result);
    }
}
