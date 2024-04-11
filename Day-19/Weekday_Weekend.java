import java.util.Scanner;

//Weekday Or Weekend: Write a Java program to
// Check Whether a Given Day of The Week is a Weekday or
// A Weekend Day Using Switch-Case Statements.

public class Weekday_Weekend {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Your Day Name :");
        String name =kb.nextLine();
        switch (name) {
            case "sunday": case "saturday":
            {
                System.out.println("This Is Weekend "+name);
                break;
            }
            case "monday": case "tuesday": case "wednesday": case "friday":
            {
                System.out.println("This Is Weekday "+name);
                break;
            }


        }

    }
}
