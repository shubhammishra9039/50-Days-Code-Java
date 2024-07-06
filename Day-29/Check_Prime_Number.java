import java.util.Scanner;

public class Check_Prime_Number {

    public static void main(String[] args) {

        Scanner kb =new Scanner(System.in);
        int a= kb.nextInt();
        if (a<=1)
            System.out.println("Number Is not Prime");
        else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    System.out.println("Number Is Not Prime :");
                    System.exit(1);
                } else {
                    System.out.println("Number Is Prime ");
                    System.exit(1);
                }
            }
        }
    }


}
