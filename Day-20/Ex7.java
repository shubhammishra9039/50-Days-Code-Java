import java.util.Scanner;

public class Ex7 {
    public static int[] increMent(int [] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            arr[i]+=1;

        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Enter A lenth of arr");
        Scanner kb=new Scanner(System.in);
        int a= kb.nextInt();
        int [] brr =new int[a];
        for(int j=0;j< brr.length;j++)
        {
            brr[j]= kb.nextInt();
        }
        increMent(brr);
        for(int x:brr)
        {
            System.out.println(x);
        }

    }
}
