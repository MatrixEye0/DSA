import java.util.Scanner;

public class method  {
    public static boolean isEven(int b)
    {
        if(b%2==0)
        {
           return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner (System.in)){
        System.out.print("Enter  number : ");
        int b=sc.nextInt();
        if (b==0)
        {
            System.out.println("Number is Zero  ");
        }
        else if(b<0)
        {
            System.out.println("Enter vaid number this is negitive number ");
        }
        else if(isEven(b))
        {
            System.out.println("Even ");
        }
        else 
        {
            System.out.println("Odd ");
        }
       
    }
}
}
 