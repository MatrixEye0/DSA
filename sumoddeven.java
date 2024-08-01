import java.util.Scanner;

public class sumoddeven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in))
         {
            int oddsum=0;
            int evensum=0;
            int i=1;
            int n=0;

            System.out.println("Enter size  :");
            n =sc.nextInt();
      
      while (i<=n) {
            System.out.println("Enter Numbers :");
            /*Scanner  = new Scanner(System.in);*/
            int input=sc.nextInt();
            if (i%2==1){
                oddsum+=input;
            }
            if (i%2==0){
                evensum+=input;
            }
            i++;
      }
      System.out.println("Odd number sum :"+oddsum);
      System.out.println("Even numbers sum:"+evensum);
        }
    }

    
}