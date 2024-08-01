import java.util.Scanner;

public class rombus 
{
    @SuppressWarnings("unused")
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter Lines number : ");
            int n = sc.nextInt();  
            int l = 1;
            int osp = n-1 ;
            int isp = n-2 ;
            while (l<n) {

                
                if(l==1 || l==n)
                {

                    
                    for(int i=0;i<osp;i++)
                    {
                        System.out.print("  ");
                    }
                
                    for(int i=0;i<n;i++)
                    {
                        System.out.print("* ");
                    }
                }
                else 
                {
                    for(int i=0;i<osp;i++)
                    {
                        System.out.print("  ");
                    }

                    System.out.print("* ");
                    for(int i=0;i<isp;i++)
                    {
                        System.out.print("  ");
                    }
                    System.out.print("* ");
                }
                System.out.println();
                osp--;
                l++;
                
            } 
        }

    }
}


