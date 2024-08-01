import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        char arr[]={'a','b','c','d'};
        @SuppressWarnings("unused")
        String str ="abdc";
        @SuppressWarnings("unused")
        String Str2=new String("xyz@#1234");

       @SuppressWarnings("resource")
    Scanner sc =new Scanner(System.in);
      /*   String name;
        name = sc.nextLine();
        System.out.println(name);
        System.out.print(name.length());*/

        //concatiation java 
        String firstname;
        String lastname;
        firstname = sc.nextLine();
        lastname = sc.nextLine();
        String fullname = firstname + " "+ lastname;
        System.out.println(fullname);
        /*charAt string ki letter print karke deta hai  kis index ka letter chaiye wo bhi 
        aur sre chaiye to for loop se deta hai;
        for (int i-0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
        */
        System.out.println(fullname.charAt(6));
    }
}
