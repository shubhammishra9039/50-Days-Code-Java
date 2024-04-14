
//Factorial Calculation

//Write a method that takes an integer n and returns
// its factorial value using a loop.
//Reverse a String

import java.util.Scanner;

public class Factorial_Calculation {
    public  static  int fact(int n)
    {
        int number =n;
        int fact =1;

       while (number>0)
       {
           fact *=number;
           number--;
       }
       return fact;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a =kb.nextInt();
        int result = fact(a);
        System.out.println(" Factorial is = "+result);

    }
}
