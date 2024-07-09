import java.util.Scanner;

public class Reverse_a_String {
    public  static  void  revers(String s)
    {
        String rev="";
        for (int i=(s.length()-1);i>=0;i--)
        {
            rev =rev+s.charAt(i);
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter A String");
        String s=kb.nextLine();
        revers(s);
    }
}
