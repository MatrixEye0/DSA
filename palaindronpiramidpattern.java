import java.util.Scanner;

public class palaindronpiramidpattern {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Lines number : ");
        int n = sc.nextInt();
        int st = 1;
        int sp = n - 1;

        for (int l = 1; l <=n; l++) {
            for (int i = 0; i < sp; i++) {
                System.out.print("   ");
            }

            for (int i = 0; i < st; i++) {
                System.out.print(l+"  ");
            }

            if (l < n) {
                st = st + 2;
                sp--;
            }

            System.out.println();
        }
    }
}
