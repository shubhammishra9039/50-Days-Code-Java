import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Enter A number ");
        Scanner kb =new Scanner(System.in);
        int a= kb.nextInt();
        if(a>0)
        {
            System.out.println("Number Is Positive");

        } else if (a<0) {
            System.out.println("Number Is Negetiv ");

        }
        else
        {
            System.out.println("Number Is Zero");
        }
    }
}
