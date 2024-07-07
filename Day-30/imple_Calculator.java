import java.util.Scanner;

public class imple_Calculator {

    public static int calculater(int a, int b ,int c)
    {
        int d=0;
        switch (c)
        {
            case 1:
                d=a+b;
            break;
            case 2:
                d=a-b;
                break;
            case 3:
                d=a*b;
                break;
            case 4:
                d=a/b;
                break;

            default:
                d=0;



        }
        return d;

    }


    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter A Number");
        int a=kb.nextInt();
        System.out.println("Enter A Number");
        int b=kb.nextInt();
        System.out.println("Whis Opreatiom Are Performed Like Pleased Choosed In \n 1. add \n 2. Subsctected\n 3.Multipled \n 4.Diviesion");
        int c=kb.nextInt();
        int result=calculater(a,b,c);
        System.out.println("The Result Is "+result);

    }
}
