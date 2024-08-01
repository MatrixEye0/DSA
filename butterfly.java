import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number : ");
            int a = sc.nextInt();
            int line = 1;
            int st = 1;
            int sp = 2 * a - 2;

            while (line <= a*2 ) {
                for (int i = 0; i < st; i++) {
                    System.out.print(" * ");
                }

                for (int i = 0; i < sp; i++) {
                    System.out.print("   ");
                }

                for (int i = 0; i < st; i++) {
                    System.out.print(" * ");
                }

                System.out.println();

                if (line < a) {
                    st++;
                    sp -= 2;
                } else {
                    st--;
                    sp += 2;
                }

                line++;
            }
        }
    }
}
