import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        try (Scanner sc=new Scanner(System.in))
        {
           
            System.out.println("Enter where you want to run table :");
            int l = sc.nextInt();

            System.out.println("Enter Number :");
            int n = sc.nextInt();


            for(int i=1;i<=l;i++)
            {
                System.out.println(n+" x "+i+" = " + n*i);
            }

        }
    }
    
}
