import java.util.Scanner;

public class stringpalindrom {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();
        int n=name.length();
        for(int i=0;i<name.length()/2;i++)
        {
            if(name.charAt(i)!=name.charAt(n-1-i))
            {
              System.out.println("Not Palindrom");
            }
            else 
            {
                System.out.print("Palindrom Number");
            }
        }

    }
}
