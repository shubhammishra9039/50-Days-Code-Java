import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Enter A number : ");
        Scanner kb =new Scanner(System.in);
        int a = kb.nextInt();
        if (a%5==0)
        {
            System.out.println("Number Divide By 5 ");

        }
        else
            System.out.println("Number Not Divide By 5 ");
    }
}
