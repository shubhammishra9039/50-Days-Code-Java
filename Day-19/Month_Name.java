

//Month Name: Write a Java program to display the name of
// the month corresponding to a given number using switch-case statements.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Month_Name {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter Month Number :");
        int a=kb.nextInt();
        switch (a)
        {
            case (1):
                System.out.println("Month Is January");
                break;
            case (2):
                System.out.println("Month is February ");
                break;
            case (3):
                System.out.println("Month Is March");
                break;
            case (4):
                System.out.println("Month is April ");
                break;
                case (5):
            System.out.println("Month Is May");
            break;
            case (6):
                System.out.println("Month is Jun ");
                break;
                case (7):
            System.out.println("Month Is July");
            break;
            case (8):
                System.out.println("Month is August ");
                break;
                case (9):
            System.out.println("Month Is September ");
            break;
            case (10):
                System.out.println("Month is October ");
                break;
                case (11):
            System.out.println("Month Is November");
            break;
            case (12):
                System.out.println("Month is December ");
                break;
        }
    }
}
