import java.util.Scanner;

class a {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        try (Scanner sc = new Scanner (System.in)){
       
        System.out.println("first number");
        int b=sc.nextInt();
       
        System.out.println("second number");
        int c=sc.nextInt();

        System.out.println("third number");
        int d=sc.nextInt();

        int av=(b+c+d)/3;
        System.out.println("Average is : "+av);
    }
}
}
 