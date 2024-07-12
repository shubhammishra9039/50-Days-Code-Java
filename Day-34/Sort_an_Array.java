public class Sort_an_Array {


    public  static  void Sort(int arr [])
    {

        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {

                if(arr[i]>arr[j])
                {
                    int tem;
                    tem=arr[j];
                    arr[j]=arr[i];
                    arr[i]=tem;
                }
            }
        }
        System.out.println();
        for(int x:arr)
        {
            System.out.print(x+" ,");
        }

    }

    public static void main(String[] args) {

        int arr[]={10,30,45,2,68,8,5,78,42};
        for (int x:arr)
        {
            System.out.print(x+" , ");
        }
        Sort(arr);
    }
}
