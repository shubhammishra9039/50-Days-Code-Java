

//Count the Number of Each Character
//Write a program that counts the frequency
// of each character in a given string using loops.

import java.util.Scanner;

public class Count_the_Number_of_Each_Character {
    public static  int count(char a,String s)
    {
        String sl=s;
        char c =a;
        int count=0;
        for (int i=0;i<=(sl.length()-1);i++)
        {
            if (c ==sl.charAt(i))
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter A String :");
        String sl =kb.nextLine();
        for (int i=0;i<=(sl.length()-1);i++)
        {
            System.out.println(sl.charAt(i)+" : "+count(sl.charAt(i),sl));
        }
    }
}
