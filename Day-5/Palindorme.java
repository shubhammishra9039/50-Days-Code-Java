import java.util.Scanner;

public class Palindorme {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        boolean a;
        int tem=0,rev=0;
        while (n!=0)
        {
            tem=n%10;
            rev=rev*10+tem;
            n=n/10;

        }
        a=(n==rev);

        if (a==true)
        {
            System.out.println("The Number Is Plindorme");
        }
        else
        {
            System.out.println("The Number Is Not Plindorme");
        }

    }
}
