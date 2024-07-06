import java.util.Scanner;

public class Finde_minmun_Number {

    public  static  int  minNumber(int a,int b,int c)
    {
        if(a<b)
        {
            if(a<c)
            {
                return  a;

            }
            else
            {
                return c;
            }
        }
        else
        {
            if(b<c)
            {
                return b;
            }
            else
            {
                return c;
            }
        }

    }
    public static void main(String[] args) {
        Scanner k = new Scanner( System.in);
        System.out.println("Enter First Number :");
        int a= k.nextInt();
        System.out.println("Enter Second Number");
        int b=k.nextInt();
        System.out.println("Enter Thrred Number");
        int c=k.nextInt();

        int result = minNumber(a,b,c);
        System.out.println("Mini Number Is :"+result);

    }
}
