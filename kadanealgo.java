public class kadanealgo {
    public static void kd(int n[] ) {
       @SuppressWarnings("unused")
       
       int ms=Integer.MIN_VALUE;
       int cs=0; 
       for(int i=0;i<n.length;i++)
       {
        cs+=n[i];
        if(cs<0)
        {
            cs=0;
        }
        ms=Math.max(cs,ms);
       }
       System.out.println("Max sum of Subarray is : "+ ms);
    }
    
    public static void main(String[] args) {
      int n[]={4,6,-4,-8,6,9,2};
      kd(n);
    }
}
