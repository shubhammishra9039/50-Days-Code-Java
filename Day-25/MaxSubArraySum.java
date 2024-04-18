public class MaxSubArraySum {
    public static void main(String[] args) {
        int []arr = {1,-2,6,-1,3};
        int sum=0; int max=Integer.MIN_VALUE;
        for(int start=0;start<arr.length;start++)
        {
            for(int end=start+1;end<arr.length;end++)
            {
                sum=0;
                for(int k=start;k<=end;k++)
                {
                    sum=sum+arr[k];


                }
                System.out.println(sum);
                if(max<sum)
                {
                    max=sum;
                }
            }
        }
        System.out.println("Max Sum Is : = "+max);
    }
}
