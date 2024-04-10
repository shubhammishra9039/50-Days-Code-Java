
//Vowel or Consonant: Write a Java program to check whether
// a given character is a vowel or a consonant using if-else statements.


import java.io.IOException;
import java.util.Scanner;

public class Vowel_cons {
    public static void main(String[] args) throws IOException {
        Scanner kb =new Scanner(System.in);
        char val =(char) System.in.read();
        if (val =='a' || val =='e' || val =='i'|| val =='o'||val =='u'
        || val =='A' || val =='E' || val =='I' ||val =='O'||val =='U'    )
        {
            System.out.println("This Is Vowel : "+val);
        }
        else
            System.out.println("This Is  Consonate : "+val);
    }
}
