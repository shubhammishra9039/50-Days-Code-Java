import java.util.Scanner;

public class Range_prime_Number {
    public static boolean prime(int n){
        if(n==2)
            return true;
        else
        {
            for (int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void range(int n){
        for (int i=2;i<=n;i++)
        {
            boolean r=prime(i);
            if (r==true)
                System.out.print(" "+i);
        }

    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter A Numbers");
        int n=kb.nextInt();
        range(n);
    }
}


