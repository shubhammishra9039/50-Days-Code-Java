import java.util.Scanner;

public class Check_Armstrong_Number {

    public static  int pow(int a)
    {
        int power=0;
        while (a!=0)
        {
            power++;
            a/=10;
        }
        return power;
    }
    public static double amrstong(int a)
    {
        double sum=0;
        int power=pow(a);
        while (a!=0)
        {
            int temp;
            temp=a%10;
            sum=sum+Math.pow(temp,power);
            a/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter A Number");
        int a=kb.nextInt();
        double result =amrstong(a);
        if(a==result)
        {
            System.out.println("Number Is Amrstronge");
        }
        else
            System.out.println("Number Is not Amrstrong");

        System.out.println("The result is :"+result);
    }
}
