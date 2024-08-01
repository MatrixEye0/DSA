import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){;
        System.out.println("Enter Number");
        int a = sc.nextInt();
        
        int b = (a>0)?1:-1;
        if (a==0)
        {
            b=a;
        }
        switch (b) {
            case 0:
                System.out.println("Zero");
                break;
                case 1:
                System.out.println("Positive");
                break;
                case -1:
                System.out.println("Negitive");
                break;

              
        
           /*default:
            if (b>0){
            System.out.println("positive");
                break;
            }
               else if (b<0){
                    System.out.println("negitive");
                        break;
                    }
                        else 
                        {
                            System.out.println("other");
                        } */ 

                        
        }

    }
}
}
