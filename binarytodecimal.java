import java.util.*;

@SuppressWarnings("unused")
public class binarytodecimal {

    // Declare decnum as a class-level variable
    static int decnum = 0;

    public static int bintodc(int a) {
        int pow = 0;
        while (a > 0) {
            int ld = a % 10;
            decnum = decnum + (ld * (int) Math.pow(2, pow));
            pow++;
            a = a / 10;
        }
        // Return the calculated decimal value
        return decnum;
    }

    public static void main(String[] args) {
        // Assign the result of bintodc to a variable
        int result = bintodc(11010);
        System.out.println(result);
    }
}
