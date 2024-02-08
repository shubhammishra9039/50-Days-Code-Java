import java.util.Scanner;

public class ConditionBase {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        while(true){
            System.out.println("Enter A Number");
            int n=kb.nextInt();

            if(n%10==0)
            {
                break;
            }
            System.out.println("number Is "+n);

        }
    }
}
