import java.util.Scanner;
//Implement a Java program to find t
// he largest among three numbers using if-else statements.
public class Largest_Three_Number {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter A First  Number ");
        int a =kb.nextInt();
        System.out.println("Enter  Second Number ");
        int b = kb.nextInt();
        System.out.println("Enter Thred Number ");
        int c = kb.nextInt();
        if (a>b)
        {
            if (a>c)
                System.out.println(" A Is Largest Number "+a);
            else
                System.out.println(" C is Largest Number "+b);
        }
        else
        {
            if (b>c)
                System.out.println(" B is Largest Number "+b);
            else
                System.out.println("C is Largest Number "+c);
        }
    }
}
