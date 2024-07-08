import java.util.Scanner;

public class Largest_among_Three {

    public  static int largest_among_three(int a,int b,int c)
    {
        int result =(a>b)?((a>c)?a:c):((b>c)?b:c);
        return result;

    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter A Fist Number ");
        int a= kb.nextInt();
        System.out.println("Enter A Second  Number ");
        int b=kb.nextInt();
        System.out.println("Enter A Thread Number ");
        int c=kb.nextInt();

        int result=largest_among_three(a,b,c);
        System.out.println("Result Is "+result);


    }
}
