import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args) {
            Scanner kb=new Scanner(System.in);
            int n= kb.nextInt();
            if(n==2)
            {
                System.out.println("Number Is Prime");
            }
            else
            {
                for (int i=2 ;i<n;i++)
                {
                    if(n%i==0)
                    {
                        System.out.println("number Is Not Prime");
                        return;
                    }

                }
                System.out.println("Number Is prime");
            }
        }
}
