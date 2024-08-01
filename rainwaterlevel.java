public class rainwaterlevel {
    public static int rwl ( int nt[]) {
        int n=nt.length;
        int lm[]=new int[n];
        lm[0]=nt[0];
        for(int i=1;i<n;i++)
        {
            lm[i]=Math.max(nt[i],lm[i-1]);
        }
        int rm[] = new int[n];
        rm[n-1]=nt[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rm[i]=Math.max(nt[i],rm[i+1]);
        }
        int tw=0;
        for(int i=0;i<n;i++)
        {
            int wl=Math.max(lm[i],rm[i]);
            tw+=wl-nt[i];
        }
        System.out.println("Total Waterlevel is : " +tw);
        return tw;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int nt[]={7,9,6,0,3,2,8,5};
        rwl(nt);
    }
}
