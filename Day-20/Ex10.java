import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int largest =0;
        int Secondlargest=0;
        System.out.println("Enter A Array Size");
        Scanner kb = new Scanner(System.in);
        int a=kb.nextInt();
        System.out.println("Enter Array EeleMent : ");
        int arr []=new int[a];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]= kb.nextInt();
        }
        // First Largest Number Loop
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }

        }
        // Second Largest Number
        for(int i=0;i<arr.length;i++)
        {
            Secondlargest=arr[i];
           if (Secondlargest>=largest)
            {

               break;
            }
        }
        System.out.println("Largest NUmber Is "+largest+"\n Second Largest "+Secondlargest);
    }
}
