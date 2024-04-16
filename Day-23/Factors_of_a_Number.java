//Find All Factors of a Number
//Write a method that prints all factors of a given number n using a for loop.


import java.util.Scanner;

public class Factors_of_a_Number {
    public  static  void factors(int n)
    {
        int number =n;
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
                System.out.print(i+" , ");
        }
    }

    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter A Number For Factors :");
        int a=kb.nextInt();
        factors(a);
    }
}
