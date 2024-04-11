import java.util.Scanner;

//Grading System: Write a Java program to implement a simple
// grading system based on the marks obtained using if-else statements.
public class Greding_system {
    public static void main(String[] args) {
        System.out.println("Enter Your Marks : ");
        Scanner kb =new Scanner(System.in);

        int a =kb.nextInt();

        if(a>85)
            System.out.println("You Passing Grade : A+ "+a);
        else if (a>70)
            System.out.println("You Passing Garde : A "+a);
        else if (a>60)
            System.out.println("Your Passing Garde : first Diveion");
        else
            System.out.println("Your Are Falid "+a);

    }
}
