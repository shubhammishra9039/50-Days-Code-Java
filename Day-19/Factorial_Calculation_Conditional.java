//Factorial Calculation:
// Write a Java program to calculate the factorial of a
// given number using if-else statements.


import java.util.Scanner;

public class Factorial_Calculation_Conditional {
    public static void main(String[] args) {
        Scanner kb = new Scanner( System.in);
        System.out.println("Enter A Number ");
        int a = kb.nextInt();
        int fact=1;
        if(a==1 || a==0)
            System.out.println("Factorial is  :"+a);
        else if (a>1)
        {
            for (int i = 1;i<=a;i++)
            {
                fact *=i;
            }
            System.out.println("Factorial is : "+fact);
        }
        else
            System.out.println("Number Is Negative :");
    }
}
