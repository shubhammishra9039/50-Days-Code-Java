
//Check if an Array is Palindrome
//Example Input: [1, 2, 3, 2, 1]
//Example Output: true


import java.util.Scanner;

public class Array_is_Palindrome {
    public  static  boolean palindrome(int [] arr)
    {
        int [] brr=arr;
        int[] crr = new int[5];
        int l=0;
        int count=0;
        System.out.println("Array Is");
        for (int x:brr) {
            System.out.print(x+",");

        }
        for (int i=(brr.length-1);i>=0;i--)
        {
            crr[l]=brr[i];
            l++;
        }
        System.out.println();
        System.out.println("Revered Array Is");
        for (int x:crr) {

            System.out.print(x+",");

        }
        for (int i =0;i<brr.length;i++)
        {
            if (brr[i]!=crr[i])
            {
                count++;
            }
        }
        if(count==0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter Five Elements ");
        int [] arr = new int[5];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=kb.nextInt();
        }

        boolean result=palindrome(arr);
        System.out.println();
        if (result)
        {
            System.out.println("Array Is Palindrome");
        }
        else
        {
            System.out.println("Array Is  Not Palindrome");
        }


    }
}
