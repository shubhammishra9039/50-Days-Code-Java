import java.util.Scanner;

public class Palindrome_Checker_String {
    public  static  String Palindeome(String s)
    {
        String rev="";
        for (int i=(s.length()-1); i>=0;i--)
        {
            char tem=s.charAt(i);
            rev=rev+tem;

        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter A String :");
        String str=kb.nextLine();
        String result =Palindeome(str);
        if(str.equalsIgnoreCase(result))
        {
            System.out.println("String Palindorme");
        }
        else
        {
            System.out.println("String Not Palindorme");
        }
    }
}
