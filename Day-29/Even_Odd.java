import java.util.Scanner;

public class Even_Odd {
    public  static String evenOdd(int a)
    {
        if(a%2==0)
            return "Even Number";
        else
            return "Odd Number";
    }

    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter Number :");
        int a= kb.nextInt();
        String result =evenOdd(a);
        System.out.println("Result Is :"+result);
    }
}
