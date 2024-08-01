
public class subarr{
    public static void suba(int n[]) {
        int ts =0;
        int cs= 0;
        int ms = Integer.MAX_VALUE;
       for(int i=0;i<n.length;i++) 
       {
        int st=i;
        for(int j=i;j<n.length;j++)
        {
            int end=j;
            int sum=0;
            for(int k=st;k<=end;k++)
            {
                sum+=n[k];
                System.out.print(n[k]+",");
                cs += n[k];
            }

            System.out.print( "  Sum of sub array is  = " +sum );
            if(ms<cs)
            {
                ms=cs;
            }
            System.out.println( " , khighest sum  = " +ms);
            ts++;
            System.out.println();
        }
        System.out.println();
       }
       System.out.println("total subarray : " + ts);
    
    }
    public static void main(String[] args) {
        int n[]={6,9,8,7,5,3,0,4};
        suba(n);
    }
}
