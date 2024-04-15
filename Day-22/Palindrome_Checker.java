
//Palindrome Checker
//Implement a method that checks if a given string is a palindrome using a loop.


import java.util.Scanner;

public class Palindrome_Checker {
    public  static  boolean stringPalindorm(String s)

    {

        String mystring=s;
        String newString="";
        for (int i =(s.length()-1);i>=0;i--)
        {
            newString=newString+s.charAt(i);
        }

        if (mystring.equalsIgnoreCase(newString))
        {
            System.out.println("My string :"+mystring);
            System.out.println("Revers String :"+newString);
            return true;
        }
        else
        {
            System.out.println("My string :"+mystring);
            System.out.println("Revers String :"+newString);
            return  false;
        }




    }

    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter A String :");
        String s=kb.nextLine();
        boolean result=stringPalindorm(s);
        if (result==true)
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is Not  Palindrome");
        }
    }
}
