import java.util.*;

@SuppressWarnings("unused")
public class linearsearch {
    public static int ls(int n[] , int key) {
        for(int i=0;i<n.length;i++)
        {
            if(n[i]==key){
                return i;
            }
           
        }
        return -1;
    }
    public static void main(String[] args) {
      
        int n[]={7,9,5,4,0,3,21,89,99};
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Search number : ");
        int key=sc.nextInt();
        int ind =  ls(n,key);
       if(ind ==-1)
       {
        System.out.print("Key NOT found");
       }
    
       else {
        System.out.print("Key find at :"+ind);
       }
       
    }
}
