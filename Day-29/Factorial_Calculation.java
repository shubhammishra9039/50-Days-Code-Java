import java.util.Scanner;

public class Factorial_Calculation
{
    public  static  int fact(int a)
    {
        int f =1;
        while (a!=0)
        {
            f*=a;
            a--;
        }
        return f;
    }

    public static void main(String[] args)
    {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter A Number For Factorial");
        int a= kb.nextInt();
        int result = fact(a);
        System.out.println("Result Is = "+result);
    }
}
