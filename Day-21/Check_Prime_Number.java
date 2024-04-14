
//Check Prime Number
//        Write a method that takes an integer input and returns
//        true if it is a prime number, and false otherwise.
//        Use a for-loop to check divisibility.

import java.util.Scanner;

public class Check_Prime_Number {
    public  static  void prime(int n)
    {
        int number =n;
        int count=0;
        if(number == 2)
        {
            System.out.println("Number Is Prime : "+number);


        }
        else
        {
            for (int i=2;i<number;i++)
            {
                if (number%i==0)
                {
                    System.out.println("Number is Not Prime :"+number);
                    count++;
                    break;
                }
            }
            if (count==0) {
                System.out.println("Number is Prime:" + number);
            }
        }

    }
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter A Number :");
        int a = kb.nextInt();
        prime(a);

    }
}
