import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        try ( Scanner sc = new Scanner(System.in) ){
           int factorial =1;
           int n=0;
           System.out.println("Enter Positive integer :");
           n=sc.nextInt();
           if (n>0){
           for( int i=1 ; i<=n; i++ )
           {
             factorial*=i;
           }
           System.out.println("Factorial is : " + factorial);
           }
           if (n<0)
           {
            System.out.println("Enter Positive number");
           }
        }
    }
}
