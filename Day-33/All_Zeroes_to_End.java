public class All_Zeroes_to_End {
    public static  void  zero(int arr[])
    {
        int min=Integer.MAX_VALUE;
        for (int i =0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {

                if (arr[i]<arr[j])
                {
                    int tem;
                    tem =arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }

        }
        System.out.println();

        for (int x:arr)
        {
            System.out.print(x+" , ");
        }
    }


    public static void main(String[] args) {
        int arr []={0, 1, 0, 3, 12};
        for (int x:arr)
        {
            System.out.print(x+",");
        }
        zero(arr);
    }


}
