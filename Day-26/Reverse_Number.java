import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter A number");
        int n=kb.nextInt();
        int rev=0 ,tem=0;
        while (n!=0)
        {
            tem=n%10;
            rev=rev*10+tem;
            n=n/10;

        }
        System.out.println(rev);
    }
}
