import java.util.Scanner;

public class String_is_a_Palindrome {


    public  static boolean palindrome(String s)
    {
        boolean result =true;
        String rev="";
        for (int i=s.length()-1;i>=0;i--)
        {
            rev =rev+s.charAt(i);

        }
        if (rev.equalsIgnoreCase(s))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter A String ");
        String s=kb.nextLine();
        boolean result=palindrome(s);
        if (result)
            System.out.println("String Is Palindorme");
        else
            System.out.println("String Is Not Palindorm");

    }
}
