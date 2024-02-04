import java.util.Scanner;

public class Count_And_Display_The_Prime_Number {

    public static class Print_prime_Number
    {
        public boolean prime(int n)
        {
            if (n==2)
            {
               return true;
            }
            else
            {
                for (int i=2 ;i<n;i++)
                {
                    if (n%i==0)
                    {
                        return false;
                    }
                }

                return true;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter Rang The Number");
        Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();
        Print_prime_Number obj=new Print_prime_Number();

        for (int i=2;i<=a;i++)
        {
            boolean b= obj.prime(i);
            if (b==true)
            {
                System.out.print(i+" ");
            }
        }

    }
}
