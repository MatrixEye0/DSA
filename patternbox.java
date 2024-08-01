import java.util.Scanner;

public class patternbox {
  
    @SuppressWarnings("unused")
    public static void main(String[] args) {
         int a;
        int st = 1;
        int sp;
        int line =1; 

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter rows : ");
            a = sc.nextInt();
            sp = a - 2;
            while (line<=a-1) {
                if(line==1 || line==a-1)
                {
                    for (int i = 0; i < a; i++) {
                        System.out.print(" * ");   
                    }
                    System.out.println();
                }
                else{

                    System.out.print(" * ");

                    for (int j = 0; j < sp; j++) {
                        System.out.print("  ");
                    }

                    System.out.print(" * ");
    
                    System.out.println();
                  

                }
                st++;
                sp--;
                
                line++;
            }

            }
        }
    }

