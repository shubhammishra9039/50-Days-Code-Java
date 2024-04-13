import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        System.out.println("Enter A Array Size");
        int a=Integer.MIN_VALUE;
        Scanner kb= new Scanner(System.in);
        int b= kb.nextInt();
        System.out.println("Enter A Array List ");
        int arr [] = new int[b];
        for (int i=0;i< arr.length;i++)
        {
            arr[i]= kb.nextInt();
        }
        for(int j=0;j< arr.length;j++)
        {
            if(arr[j]>a)
            {
               a=arr[j];
            }
        }

        System.out.println("Largest Number Is : "+a);
    }
}
