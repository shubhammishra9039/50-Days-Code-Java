public class Spiral_Order_Matrix_Traversal {
        public static void marge(int arr[],int brr[],int crr[])
        {
            int srr[]=new int[(arr.length+brr.length+crr.length)];
            int index=0;
            for (int i=0;i<arr.length;i++)
            {

                    srr[index++]=arr[i];

            }
            for (int i=0;i<brr.length;i++)
            {

                    srr[index++]=brr[i];

            }
            for (int i=0;i<crr.length;i++)
            {

                    srr[index++]=crr[i];

            }
            System.out.println();
            for (int x:srr)
            {
                System.out.print(x+" ,");
            }

        }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int brr[]={4,5,6};
        int crr[]={7,8,9};

        marge(arr,brr,crr);
    }
}
