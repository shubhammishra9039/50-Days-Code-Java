import java.util.Scanner;

public class Quadratic_Equation_Roots {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Values A,B,C For ax^2 + bx + c = 0 ");
        double a= kb.nextInt();
        double b= kb.nextInt();
        double c =kb.nextInt();
        double result = (b*b -4*a*c);

        double fact1 ,fact2;
        if (result==0)
            System.out.println("there is exactly one real root (also known as a repeated or double root)");
        else if (result<0)

            System.out.println("there are no real roots; instead, there are two complex roots, which are conjugates of each other.");
        else
        {
            fact1 =((-b+Math.sqrt(result))/(2*a));
            fact2 =((-b-Math.sqrt(result))/(2*a));
            System.out.println("Fact 1 Is :"+fact1+ "\nfact 2 is :"+fact2);

        }
    }
}
