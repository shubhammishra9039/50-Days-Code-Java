
//Check Armstrong Number
// Implement a Java method that checks if a number is
// an Armstrong number or not. An Armstrong number is
// an integer such that the sum of the cubes of its digits
//  is equal to the number itself. For example, 153 is an
//  Armstrong number because 1³ + 5³ + 3³ = 153.

import java.util.Scanner;

public class Armstrong_Number {
    public  static int amrstrong(int p,int n)
    {
        int pow=p;
        int num=n;
        double temp=0;
        double sum=0;


        while (num>0)
        {
            temp=num%10;
            sum +=Math.pow(temp,pow);
            num/=10;



        }
        return (int)sum;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter A number :");
        int number =kb.nextInt();
        int pow=0;
        int num=number;
        while (num>0)
        {
            pow++;
            num /=10;

        }


        int result=amrstrong(pow,number);
        if (result==number)
        {
            System.out.println("Number Is Armstrong  : "+result);
        }
        else
        {
            System.out.println("Number Is Not  Armstrong  : "+result);
        }
    }



}
