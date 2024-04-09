import java.util.Scanner;

public class Calculeter {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter First Number :");
        int a = kb.nextInt();
        System.out.println("Enter Second  Number :");
        int b = kb.nextInt();

     int c;

        do {
            System.out.println("For Sum = 1  for divied = 2  for multiple = 3 for dived =4  Exit =0");
             c =kb.nextInt();

            int result ;
            switch (c)
            {
                case 1:
                    result =a+b;
                    System.out.println(" Result is = "+ result);
                    break;

                case 2:
                    result =a-b;
                    System.out.println(" Result is = "+ result);
                    break;
                case 3:

                    result =a*b;
                    System.out.println(" Result is = "+ result);
                    break;

                case 4:

                    result =a/b;
                    System.out.println(" Result is = "+ result);
                 break;

            }



        }while (c!=0);
    }
}
