import java.util.Scanner;

public class Find_All_Factors_of_a_Number {
    public static  void fact(int a)
    {
        for (int i=1;i<=a;i++)
        {
            if (a%i==0)
            {
                System.out.print(i+" ,");
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter A Number ");
        int a=kb.nextInt();
        fact(a);

    }
}
