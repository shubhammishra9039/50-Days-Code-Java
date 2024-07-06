import java.util.Scanner;

public class Fibonacci_Series {
    public static  void fibonacci(int l)
    {
        int a=0,b=1,sum=0;
        while (a<=l)
        {
            sum=a+b;
            System.out.print(a+",");
            a=b;
            b=sum;
        }
    }

    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("What Length is need");
        int a =kb.nextInt();
        fibonacci(a);
    }
}
