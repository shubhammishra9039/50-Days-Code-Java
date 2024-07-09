import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();
        boolean result=true;
        if(a<=1)
        {
            System.out.println("Number Is Not Prime");
        }
        else
        {
            for (int i=2 ; i<a ;  i++)
            {
                if (a%i==0)
                {
                    result =false;
                    break;
                }
            }

        }
        if (result)
            System.out.println("Number Is Prime");
        else
            System.out.println("Number Is Not Prime");


    }
}
