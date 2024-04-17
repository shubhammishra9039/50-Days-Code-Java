//Find the Maximum and Minimum Element in an Array
//        Example Input: [3, 1, 7, 5, 2]
//        Example Output: Max = 7, Min = 1


import java.util.Scanner;

public class Maximum_and_Minimum_Element {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] arr= new int[5];
        System.out.println("Enter Array Five Elements :");
        for (int i=0;i< arr.length;i++)
        {
            arr [i]= kb.nextInt();
        }
        for (int a:arr)
        {
            System.out.print(a+",");
        }

        int min=arr[0];
        int max=0;

        for (int i=0;i< arr.length;i++)
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                }
                else if(arr[i]<min)
                {
                    min=arr[i];
                }
            }
        System.out.println("Max Numner is = "+max);
        System.out.println("Min Numner is = "+min);


    }
}
