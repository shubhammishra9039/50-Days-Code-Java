import java.util.Scanner;

//Largest among Three: Write a Java program to
// find the largest among three numbers using ternary operator.
public class Largest_number_using_ternary {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter First Number :");
        int a = kb.nextInt();
        System.out.println("Enter Second Number :");
        int b=kb.nextInt();
        System.out.println("Enter Thred Number :");
        int c=kb.nextInt();
        int s = (a>b)?(a>c ? a:c):(b>c?b:c);
        System.out.println(" Largest Number : "+s);
    }

}
