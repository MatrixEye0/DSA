
import java.util.*;

@SuppressWarnings("unused")
public class  reversearr {
    public static int rev(int n[]) {
        int f = 0;
        int end = n.length - 1;
        while (f < end) {
          int temp=n[end];
          n[end]=n[f];
          n[f]=temp;
          f++;
          end--;
        }
        System.out.println("Element not found");
        return -1;
    }

    public static void main(String[] args) {
        int n[] = {3, 5, 6, 8, 9, 12, 45, 78};
        rev(n);
        for(int i=0;i<n.length;i++)
        {
            System.out.print(" " + n[i]);
        }
        System.out.println();
    }
}
