//Sum of Digits

//Write a program to calculate the sum
// of the digits of an integer (e.g., the sum of the digits of 123 is 1 + 2 + 3 = 6).


import java.util.Scanner;

public class Sum_of_Digits {
    public  static void sumDigit(int n)
    {
        int number =n;
        int sum=0;
        while (number>0)
        {
            int temp =number%10;
            sum +=temp;
            number /=10;
        }
        System.out.println("The Digit Sum Is = "+sum);
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter A number For Sum A Digit :");
        int n=kb.nextInt();
//        System.out.println("lll");
        sumDigit(n);
    }
}
