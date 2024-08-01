import java.util.Scanner;

class addsum {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner (System.in)){
       
        System.out.print("Enter number : ");
        int b=sc.nextInt();
        int sum =0;
        while (b!=0) {
            sum+=(b%10);
            b/=10;
        }
        System.out.println(sum);
    }
}
}
 