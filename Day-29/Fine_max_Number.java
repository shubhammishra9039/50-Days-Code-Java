import java.util.Scanner;

public class Fine_max_Number {
        public static int maxNumber(int a ,int b,int c)
        {
            if(a>b)
            {
                if(a>c)
                {
                    return a;
                }
                else
                    return c;
            }
            else
            {
                if(b>c)
                {
                    return  b;
                }
                else
                {
                    return c;
                }
            }

        }
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter Fist Number");
        int a=kb.nextInt();
        System.out.println("Enter Second Number");
        int b=kb.nextInt();
        System.out.println("Enter Thired Number");
        int c=kb.nextInt();


        int result=maxNumber(a,b,c);
        System.out.println(
                "Max Number Is "+result
        );
    }
}
