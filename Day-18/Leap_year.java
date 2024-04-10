

//Leap Year: Write a Java program to check if a given year
// is a leap year or not using if-else statements.
// dived by 4 or 400 both
// dont dived by 100


import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int a = kb.nextInt();
        if (a%4==0 && a%100!=0 || a%400==0)
        {
            System.out.println("This Is Leap Year :"+a);
        }
        else
        {
            System.out.println("This Is Not Leap Year :"+a);
        }
    }

}
