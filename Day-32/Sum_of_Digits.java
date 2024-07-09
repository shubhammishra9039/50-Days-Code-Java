import java.util.Scanner;

public class Sum_of_Digits {

    public  static  void sum(int a)
    {
        int sum=0;
        while (a!=0)
        {
            int tem;
            tem =a%10;
            sum +=tem;
            a/=10;
        }
        System.out.println("Number Sum Is :"+sum);
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println("Enter  A Number :");
        int a =kb.nextInt();
        sum(a);
    }
}
