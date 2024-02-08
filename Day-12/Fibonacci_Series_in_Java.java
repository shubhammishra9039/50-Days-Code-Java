import java.util.Scanner;

public class Fibonacci_Series_in_Java {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n= kb.nextInt();
        int f1=0;
        int f2=1;
        for(int i=0;i<n;i++)
        {

            int sum=f1+f2;
            System.out.print(f1+" ");
            f1=f2;
            f2=sum;

        }
    }
}
