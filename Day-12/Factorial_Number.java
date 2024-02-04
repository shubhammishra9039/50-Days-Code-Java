import java.util.Scanner;

public class Factorial_Number {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n= kb.nextInt();
        int fact=1;
        while (n>1)
        {
            fact=fact*n;
            n--;
        }
        System.out.println("Factorial Is "+fact);
    }
}
