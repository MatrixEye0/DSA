import java.util.Scanner;

public class palindromcheck {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        
        try (Scanner sc = new Scanner(System.in)) {
          
            System.out.print("Enter Number : ");
            int a =sc.nextInt();
            int temp=a;
            int b=0;
            while (a!=0) {
                b= b*10;
                b=b+(a%10);
                a=a/10;
            }
            if(temp==b)
            {
                System.out.println("palindrom number");
            }
            else{
                System.out.println("not palindrom");
            }



    }
}
}
