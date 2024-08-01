import java.util.*;

@SuppressWarnings("unused")
public class binarysearch {
    public static int bs(int n[], int key) {
        int st = 0;
        int end = n.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (n[mid] == key) {
                System.out.println("Found at index: " + mid + ", Element: " + n[mid]);
                return mid;
            } else if (n[mid] < key) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Element not found");
        return -1;
    }

    public static void main(String[] args) {
        int n[] = {3, 5, 6, 8, 9, 12, 45, 78};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Search number : ");
        int key = sc.nextInt();

        int o = bs(n, key);
        System.out.println("Find at index: " + o);
    }
}
