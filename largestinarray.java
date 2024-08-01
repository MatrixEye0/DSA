
import java.util.*;

@SuppressWarnings("unused")
public class largestinarray{
    public static int ls(int n[]) {
        int l=Integer.MIN_VALUE;
        int s=Integer.MAX_VALUE;
        for(int i=0;i<n.length;i++)
        {
            if(l<n[i]){
              l=n[i];
            }
            if(s>n[i]){
                s=n[i];
              }
           
        }
        System.out.print("Smallest number is : " + s);
        System.out.println();
        return l;
    }
    public static void main(String[] args) {
      
        int n[]={7,9,5,4,0,3,21,89,99};
      int o=ls(n);
       System.out.print("Largest number is : " + o);
    }
}
