public class ReverseArray {
    public static void main(String[] args) {
        int arr []={10,20,30,40,50,60};
        int start=0,end=arr.length-1;
        int team=0;
        for (int i=0;i<arr.length;i++)
        {
            if(start<=end)
            {
                team=arr[start];
                arr[start]=arr[end];
                arr[end]=team;
                start++;
                end--;
            }

        }
        for(int x:arr)
        {
            System.out.print(x+ " , ");
        }
    }
}
