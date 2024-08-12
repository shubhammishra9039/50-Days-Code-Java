// 2.	Find Minimum: Write a Java program to find the minimum between three numbers using nested if-else statements.
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        System.out.println("enter num3");
        int num3=sc.nextInt();
        
        if(num1<num2 ){
            if(num1<num3){
                System.out.println(num1+" is smaller");
            }else
                System.out.println(num3+" is smaller");
            }else{
                System.out.println(num2+" is smaller");
            }
            }
        }
    

