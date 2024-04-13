import java.util.Scanner;

public interface Ex12 {

        public static void main(String[] args)
        {
            System.out.println("Enter A number :");
            Scanner kb =new Scanner(System.in);
            int a= kb.nextInt();
            System.out.println("Enter A Array List :");
            int []arr =new int[a];
            for (int i=0;i< args.length;i++)
            {
                arr[i]= kb.nextInt();
            }

        }
}
