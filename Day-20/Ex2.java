import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Enter Two Number : ");
        Scanner kb =new Scanner(System.in);
        int a=kb.nextInt();
        int b=kb.nextInt();
        System.out.println("Befor Swaping a = "+a+" b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swaping a = "+a+" b = "+b);
    }
}

