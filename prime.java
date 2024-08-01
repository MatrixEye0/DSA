import java.util.Scanner;

public class prime 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in))
         {
            System.out.println("Enter Number");
            int n = sc.nextInt();
            boolean isPrime = true;

            for (int i = 2; i < n; i++) 
            {
                if (n % i == 0) 
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
            {
                System.out.println("Prime number");
            } else 
            {
                System.out.println("Not a Prime number");
            }
        }
    }
}
