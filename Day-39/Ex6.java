// 6.	Even/Odd: Write a Java program to check whether a given number is even or odd using if-else statements.
import java.util.Scanner;

public class Ex6 {
   public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int num=sc.nextInt(); 
        if(num%2==0){
            System.out.println("num is even");
        }else{
            System.out.println("num is odd");
        }
}
}
