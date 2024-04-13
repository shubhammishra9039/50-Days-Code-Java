import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Enter Three Number : ");
        Scanner kb =new Scanner(System.in);
        int a= kb.nextInt();
        int b=kb.nextInt();
        int c=kb.nextInt();
        if(a>b)
        {
            if(a>c)
                System.out.println("A is largeset Number = "+a);
            else
                System.out.println("C is Laegest number  ="+c);

        }
        else
        {
            if (b>c)
                System.out.println("B  is a Largest Number = "+b);
            else
                System.out.println("C is a Largest Number = "+c);
        }
    }
}

