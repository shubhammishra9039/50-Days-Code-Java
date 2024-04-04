import java.util.*;

public class LargestNumber {
    public static void LargeNumber(int[] arr)
    {
        int a=Integer.MIN_VALUE;
        int b=Integer.MAX_VALUE;
         for(int i=0;i<arr.length;i++)
         {
             if (a < arr[i])
             {

                 a = arr[i];

             }
             if (b>arr[i])
             {
                 b=arr[i];
             }

         }
        System.out.println("Largesrt Number Is = "+a);
        System.out.println("Smallest Number Is = "+b);

    }
    public static void main(String[] args)
    {
        int [] brr={300,700,90,500,150,60};
        LargeNumber(brr);

    }

}
