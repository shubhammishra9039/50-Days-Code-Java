import java.util.Scanner;

public class MtrixEx1 {
    public static void main(String[] args) {
        System.out.println("Enter A Matrix Numbers : ");
        Scanner kb =new Scanner(System.in);
        int arr[][]=new int[4][3];
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]= kb.nextInt();
            }
        }
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
