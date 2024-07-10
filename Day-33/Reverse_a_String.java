import java.util.Scanner;

public class Reverse_a_String {

    public static void rev(String s)
    {
        String rev="";
        for (int i=(s.length()-1);i>=0;i--)
        {
            rev=rev+s.charAt(i);


        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter A Number :");
        String s =kb.nextLine();
        System.out.println(s);
        rev(s);

    }
}
