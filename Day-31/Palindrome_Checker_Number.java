import java.util.Scanner;

public class Palindrome_Checker_Number {

    public static int Palindorme(int a)
    {
        int rev=0;
        while (a!=0)
        {
            int tem;
            tem=a%10;
            rev=rev*10+tem;
            a/=10;

        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter The Number :");
        int a =kb.nextInt();
        int result=Palindorme(a);
        if(a==result)
        {
            System.out.println("Number Is Palindrome");
        }
        else
        {
            System.out.println("Number Is Not Palindrome");
        }

    }
}
