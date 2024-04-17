

//Reverse an Array
//  Example Input: [1, 2, 3, 4, 5]
// Example Output: [5, 4, 3, 2, 1]

import java.util.Scanner;

public class Reverse_an_Array {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] arr=new int[5];
        int[] brr=new int[5];

        System.out.println("Enter five Elements in array :");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=kb.nextInt();
        }
        System.out.println("This Is a array");
        for (int a:arr)
        {
            System.out.print(a+",");
        }
        System.out.println();
        int sl=0;
            for (int j=(arr.length-1);j>=0;j--)
            {

                brr[sl]=arr[j];

                sl++;

            }

        System.out.println("Revered Array Is");

            for (int i=0;i< arr.length;i++)
            {
                System.out.print(brr[i]+",");
            }

    }
}
