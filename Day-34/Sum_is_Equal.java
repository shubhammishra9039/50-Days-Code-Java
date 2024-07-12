public class Sum_is_Equal {

    public static void Sum(int arr [],int a)
    {
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if ((arr[i]+arr[j])==a)
                {
                    System.out.println("{"+arr[i]+","+arr[j]+"}");
                }
            }
        }


    }
    public static void main(String[] args) {

        int arr []={2, 6, 3, 9, 11};
        int a=9;
        Sum(arr,a);

    }

}
