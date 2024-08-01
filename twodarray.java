import java.util.Scanner;

public class twodarray {
    public static void main(String args[]) 
    {
        int a[][] = new int[3][3];
        int r = a.length, c = a[0].length;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
