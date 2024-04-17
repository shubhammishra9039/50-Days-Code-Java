
//Find the "2th" Largest Element in an Array
// Example Input: [3, 2, 1, 5, 6, 4], k = 2
// Example Output: 5


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class second_Largest_Element {
    public  static int secondElement(int [] xrr)
    {
        int [] arr =xrr;
        int firstlarge=0;
        int secondlarge=0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>firstlarge)
            {
                secondlarge=firstlarge;
                firstlarge=arr[i];
            }
            if (arr[i]>secondlarge && firstlarge>arr[i])
            {
                secondlarge=arr[i];
                System.out.println(secondlarge);
            }

        }
        return secondlarge;
    }

    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter Five Elements ");
        int[] arr = new int[5];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=kb.nextInt();
        }
        int result=secondElement(arr);
        System.out.println("Result Is :"+result);
    }
}
