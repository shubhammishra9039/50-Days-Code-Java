

//Multiplication Table
//Write a method in Java that takes an integer n and
// prints its multiplication table up to 10 using loops.


import java.util.Scanner;

public class Multiplication_Table {
    public static void table(int n)
    {
        int number =n;
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+" * "+n+" = "+(i*n));
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter A Nuber For Print A Table ");
        int n =kb.nextInt();
        table(n);
    }

}


