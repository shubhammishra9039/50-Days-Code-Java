import java.util.Scanner;
//Write a Java program to check whether a
// given number is even or odd using if-else statements.

public class Even_odd_Check {
    public static void main(String[] args) {
        System.out.println("Enter A Number :");
        Scanner kb =new Scanner(System.in);
        int a = kb.nextInt();
        String result = a%2==0 ? "Even Number" : "Odd Number :";
        System.out.println("Result Is = "+result);
    }
}
