import java.util.Scanner;

public class Swap_Two_Number {
    public  static void swap(int a,int b)
    {
        System.out.println(" Before A Is ="+a);
        System.out.println(" Before B Is ="+b);
        int tem;
        tem=a;
        a=b;
        b=tem;
        System.out.println(" After A Is ="+a);
        System.out.println(" After B Is ="+b);
    }
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter A :");
        int a= kb.nextInt();
        System.out.println("Enter B:");
        int b=kb.nextInt();
        swap(a,b);
    }
}
