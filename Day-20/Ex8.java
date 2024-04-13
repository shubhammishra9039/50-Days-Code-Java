import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println("Enter A Key ");
        Scanner kb = new Scanner(System.in);
        int a= kb.nextInt();
        int count=0;
        int arr[] ={10,20,30,40,50,60,99};
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==a)
            {
                System.out.println("Index Number is : "+i);
                count++;

            }

        }
        if(count ==0)
        System.out.println("Key Not Found ");


    }
}
