import java.util.Scanner;

public class ConditionBase1 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        int n= kb.nextInt();
      for(int i=0;i<=n;i++)
        {
            if(i%10==0)
            {
                continue;

            }
            System.out.print(i+" ");
        }

    }
}
