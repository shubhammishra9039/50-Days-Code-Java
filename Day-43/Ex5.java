// 5.	Positive/Negative/Zero: Write a Java program to check whether a given number is positive, negative, or zero using if-else statements.
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("is a positive number");
        }else if(num==0){
            System.out.println("is a zero");
        }else{
            System.out.println("num is negative");
        }
    }
}
