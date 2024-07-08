import java.util.Scanner;

public class Leap_year_Code {

    public static boolean leapYear(int a)
    {
        if(a%4==0 && (a%100)!=0 || (a%400==0))
        {
            return true;

        }
        else
        {
            return  false;
        }
    }


    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter The Year");
        int a=kb.nextInt();

        boolean result=leapYear(a);
        System.out.println("Result  is "+result);

    }
}
