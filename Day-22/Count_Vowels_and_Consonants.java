

//Count Vowels and Consonants
//Write a program that counts the number of vowels and consonants in a given string using loops.


import java.util.Scanner;

public class Count_Vowels_and_Consonants {
    public  static  void countVowels_const(String s)
    {
        String a=s;
        int vol=0,cons=0;
        for (int n=(a.length()-1);n>=0;n--)
        {       char c=(char)a.charAt(n);

            if( c == 'a' || c== 'e' ||c== 'i' ||c== 'o' ||c=='u' )
            {
                vol++;
            }
            else
            {
                cons++;
            }
        }

        System.out.println("Vowels Is :"+vol);
        System.out.println("Consonants Is :"+cons);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s =kb.nextLine();
        countVowels_const(s);
    }
}
