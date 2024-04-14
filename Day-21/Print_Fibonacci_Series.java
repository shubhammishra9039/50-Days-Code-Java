
//Print Fibonacci Series

//Implement a program that prints the first 20 numbers in the
// Fibonacci series using a loop (0, 1, 1, 2, 3, 5, ...).
//Factorial Calculation
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,

import java.util.Scanner;

public class Print_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Number How Many Times The Print Fibonacci Series :");
        int number = kb.nextInt();

        int number1=0,nuber2=1,sum=0;
        for ( int i = 0; i<number ;i++)
        {
            System.out.print(number1+" , ");
            sum=number1+nuber2;
            number1=nuber2;
            nuber2=sum;


        }
    }
}
