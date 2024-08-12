// 3.	Leap Year: Write a Java program to check if a given year is a leap year or not using if-else statements.
import java.util.Scanner;

public class Ex3 {
 public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int num=sc.nextInt();
        if(num%4==0 && num%100!=0 || num%400==0){
            System.out.println("is a leap year");
        }else{
            System.out.println("is not a leap year");
        }
 }
}
