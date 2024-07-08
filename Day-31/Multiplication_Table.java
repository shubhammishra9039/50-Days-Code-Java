import java.util.Scanner;

public class Multiplication_Table {

    public  static  void table(int a)
    {

        for(int i=1;i<=10;i++)
        {
            System.out.println(a+" + "+i +" = "+i*a);
        }


    }

    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter The ");
        int a=kb.nextInt();
        table(a);
    }


}
