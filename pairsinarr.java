public class pairsinarr {
    public static void pair(int n[]) {
       for(int i=0;i<n.length;i++) 
       {
        int c=n[i];
        for(int j=i+1;j<n.length;j++)
        {
            System.out.print("("+c+","+n[j]+")");
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
        int n[]={6,9,8,7,5,3,0,43};
        pair(n);
    }
}
