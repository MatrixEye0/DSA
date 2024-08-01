import java.util.*;

@SuppressWarnings("unused")
public class array {
    public static void udp(int marks[]) {
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i] +2;
        }
    }
    public static void main (String[] args) {
        int marks[] = {1,4,6};
        udp(marks);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("array after update : "+marks[i]+" ");
        }
        System.out.println();
     
       
    }
}
