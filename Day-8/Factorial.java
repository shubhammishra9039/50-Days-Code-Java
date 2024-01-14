import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter A number");
        int a =kb.nextInt();
       long  fact=1;
        while (a!=0)
        {
            fact=fact*a;
            a--;
        }
        System.out.println("Factorial Is "+fact);
    }
}
