import java.util.Scanner;

public class Array_is_Palindrome {

    public static void palinfrome (int arr[])
    {
        int count=0;
        int j = ( arr.length-1 );
        for (int i=0; i<(arr.length); i++)
        {


            if (arr [i] != arr[j])
            {


                count++;
                break;
            }
            j--;

        }
        if(count==0)
        {
            System.out.println("array Is Palindorme");
        }
        else
        {
            System.out.println("Array Is Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int arr[]={1, 2, 3, 2, 1};
        palinfrome(arr);
    }
}
