import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int sum=0 , team=0;
        System.out.println("Enter a number : ");
        Scanner kb =new Scanner(System.in);
        int a = kb.nextInt();
        while (a!=0)
        {
            team=a%10;
            sum+=team;
            a=a/10;
        }
        System.out.println("Sum is = "+sum);
    }
}
