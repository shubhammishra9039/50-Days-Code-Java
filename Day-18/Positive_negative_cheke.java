
//Positive/Negative/Zero: Write a Java program to check whether a given number
// is positive, negative, or zero using if-else statements.


import java.util.Scanner;

public class Positive_negative_cheke {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int a =kb.nextInt();
        if(a<0)
            System.out.println("Number Is Negative :"+a);
        else if (a>0)
            System.out.println("Number Is Positive : "+a);
        else
            System.out.println("Number Is Zero : "+a);
    }
}
