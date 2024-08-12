// 7.	Vowel or Consonant: Write a Java program to check whether a given character is a vowel or a consonant using if-else statements.
import java.util.Scanner;

public class Ex7 {
    
        public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter char");
        char ch=sc.next().charAt(0);
        
        if(ch=='a'||ch== 'e'||ch== 'i'||ch=='o'||ch=='u'){
            System.out.println("is a vowel");
        }else{
            System.out.println("is a consonent");
        }
    }
}
