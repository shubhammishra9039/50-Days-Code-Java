
//Write a Java program to calculate the sum of
// the first 100 natural numbers using a loop.


import java.util.Scanner;

public class Sum_of_Natural_Numbers {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter How many Number Sum :");
        int number = kb.nextInt();
        int sum=0,count=0;
        while (count<=number)
        {
            sum +=number;
            count++;
        }
        System.out.println("Sum Is = "+sum);
    }
}
