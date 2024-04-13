import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        System.out.println("Enter First  number : ");
        Scanner kb =new Scanner(System.in);
        int a= kb.nextInt();
        System.out.println("Enter Two Number : ");
        int b=kb.nextInt();
        if(a==b)
            System.out.println("Number Are Equl ");
        else
            System.out.println("Number Are Not Equl");
    }
}
