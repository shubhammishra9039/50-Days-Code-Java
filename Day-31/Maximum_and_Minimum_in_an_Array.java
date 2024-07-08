import java.util.Scanner;

public class Maximum_and_Minimum_in_an_Array {

    public static void maxMin(int arr [])
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {

                if (arr[i]>max)
                {
                    max=arr[i];
                }
                if (arr[i]<min)
                {
                    min=arr[i];
                }



        }
        System.out.println("\nMax value is "+max+"\nmin Value is  "+min);
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter The Size Of Array");
        int a =kb.nextInt();
        int arr[]=new int[a];
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Enter The Number");
            arr[i]=kb.nextInt();
        }

        for (int x:arr)
        {
            System.out.print(x+ " ,");
        }
        maxMin(arr);

    }
}
