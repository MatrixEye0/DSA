import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        int a;
        int st = 1;
        int sp;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter rows : ");
            a = sc.nextInt();
            sp = a - 1;

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < st; j++) {
                    System.out.print(" * ");
                }
                for (int j = 0; j < sp; j++) {
                    System.out.print(" ");
                }
                System.out.println();
                st++;
                sp--;
            }
        }
    }
}
