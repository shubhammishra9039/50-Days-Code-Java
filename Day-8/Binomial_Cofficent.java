
import java.util.Scanner;
public class Binomial_Cofficent {
    public static double bino(int n,int r)
    {
        int fct_n=1;
        int fct_r=1;
        int dif=n-r;
        int fct=1;
        while (n!=0)
        {
            fct_n=fct_n*n;
            n--;
        }
       
        while (r!=0)
        {
            fct_r=fct_r*r;
            r--;
        }

        while (dif!=0)
        {
            fct=fct*dif;
            dif--;
        }

        double a=fct_r*fct;
        double result=fct_n/a;


        return  result;

    }
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int n= kb.nextInt();
        int r=kb.nextInt();
        double d=bino(n,r);
        System.out.println("Binomial Cofficent Is "+d);


    }
}
