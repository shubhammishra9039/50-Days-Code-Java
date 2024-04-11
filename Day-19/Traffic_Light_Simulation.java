//Traffic Light Simulation: Write a Java program to
// simulate a traffic light system using switch-case statements.


import java.util.Scanner;

public class Traffic_Light_Simulation {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter Your Signal name : Red - Green - Yellow");
        String name =kb.nextLine();
        switch (name)
        {
            case "Red":
                System.out.println("Signal Is Stop ");
                break;
            case "Green":
                System.out.println("Signal is Go");
                break;
            case "yelloe":
                System.out.println("Signal is Wait ");
                break;
            default :
                    System.out.println("Invalid Input : ");
                break;

        }


    }
}
