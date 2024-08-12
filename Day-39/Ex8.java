// 8.	Largest among Three: Write a Java program to find the largest among three numbers using ternary operator.
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        System.out.println("enter num3");
        int num3=sc.nextInt();

        int result=(num1>num2)?(num1>num3 ? num1:num3):(num2>num3?num2:num3);
        System.out.println(result+" is greater");
}
}
