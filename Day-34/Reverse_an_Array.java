import java.util.Scanner;

public class Reverse_an_Array {

    public  static void revered(int arr [])
    {
        int [] brr= new int[arr.length];
        int j=(arr.length-1);
        for(int i=0;i<arr.length;i++)
        {

           brr[j]=arr[i];
           j--;





        }
        for (int x:arr)
        {
            System.out.print(x+" ,");
        }
        System.out.println();
        for (int x:brr)
        {
            System.out.print(x+" ,");
        }
    }

    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter The Size of : ");
        int a=kb.nextInt();
        int [] arr = new int[a];
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Enter The Number :");
            arr[i]=kb.nextInt();
        }
        revered(arr);
    }
}
