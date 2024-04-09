import java.util.Scanner;

//Find Minimum: Write a Java program to
// find the minimum between three numbers using nested if-else statements.
public class Min_Number {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter The First Number");
        int a =kb.nextInt();
        System.out.println("Enter The Second Number ");
        int b =kb.nextInt();
        System.out.println("Enter The Third Number ");
        int c =kb.nextInt();
        if (a<b)
        {
            if (a<c)
                System.out.println("A Is Smallest Number :"+a);
            else
                System.out.println("C is Smallest Number :"+c);

        }
        else
        {
            if (b<c)
                System.out.println("B is Samalest Number : "+b);
            else
                System.out.println("C Is  Smallest Number :"+c);
        }
        
    }
}
