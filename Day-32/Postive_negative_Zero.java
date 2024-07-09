import java.util.Scanner;

public class Postive_negative_Zero {

    public  static  String valuNumber(int a)
    {
        if (a>0)
            return "Postive Number";
         else if(a<0)
             return "Negative Number";
         else
             return "Number Is Zero";
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter A Number :");
        int a=kb.nextInt();
        String result=valuNumber(a);
        System.out.println(result);
    }
}
