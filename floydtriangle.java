public class floydtriangle {

    public static void ft (int n) {
        @SuppressWarnings("unused")
        int counter=1;
        for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=i;j++)
          {
             System.out.print(counter+" ");
             counter++;
          }
          System.out.println();
        }
    }
    public static void main(String[] args) {
        ft(5);
    }
}
