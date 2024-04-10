//Palindrome Check: Write a Java program to check
// if a given string is a palindrome or not using if-else statements.


import java.util.Scanner;

public class StringPalindorm {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s =kb.nextLine();
        StringBuffer sb =new StringBuffer(s);
        String a= String.valueOf(sb.reverse());
        if (s.equalsIgnoreCase(a))
        {
            System.out.println("String Plindorm");
        }
        else
            System.out.println("String Not Plindorm");
    }
}
