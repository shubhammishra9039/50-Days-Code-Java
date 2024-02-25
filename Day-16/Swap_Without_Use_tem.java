import java.util.Scanner;

public class Swap_Without_Use_tem {
    public static void swap(int a, int b)
    {
        System.out.println(" After A is "+a);
        System.out.println(" After B is "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(" Before A is "+a);
        System.out.println(" Before B is "+b);
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter A :");
        int a= kb.nextInt();
        System.out.println("Enter B :");
        int b=kb.nextInt();
        swap(a,b);
    }
}
