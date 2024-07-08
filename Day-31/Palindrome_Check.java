import java.util.Scanner;

public class Palindrome_Check {
        public static  boolean palindor(int a)
        {
            int Number=a;
            int rev=0;
            while (a!=0)
            {
                int temp=0;
                temp =a%10;
                rev =rev*10+temp;
                a /=10;
            }


            if(Number== rev)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter The Number");
        int a=kb.nextInt();
        boolean result = palindor(a);
        System.out.println("Result is :"+result);


    }
}
