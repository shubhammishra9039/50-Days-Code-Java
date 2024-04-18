public class ReversArray {
    public static void revers(int [] arr)
    {
        int team=0,start=0,end=arr.length-1;
        while (start<end) {
            team = arr[start];
            arr[start] = arr[end];
            arr[end] = team;
            start++;
            end--;
        }


    }
    public static void main(String[] args) {
        int []brr={10,20,30,40,50,60,70,80};

        revers(brr);
        for(int x:brr)
        {
            System.out.print(x+" ");
        }

    }
}
