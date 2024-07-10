public class Largest_Element_in_an_Array {


    public  static void largset(int arr [])
    {
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Largest Number : "+max);
    }
    public static void main(String[] args) {
        int arr []={1,45,785,42,63,12};
        for (int x:arr)
        {
            System.out.print(x+" ,");
        }
        largset(arr);
    }
}
