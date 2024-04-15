
//Reverse a String
//Write a Java program to reverse a given string using a loop.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Reverse_a_String {
    public static void reverseString(String s)
    {
        String a=s;
        int idx=0;

        for (int i=(s.length()-1);i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Your String :");
        String s =kb.nextLine();
        System.out.println("your String Is :"+s);
        reverseString(s);

    }
}
