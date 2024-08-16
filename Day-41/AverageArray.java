public class AverageArray {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        int arr[]=new int[]{34,6,3,2,5,7,9,4,6};
        for(int i=0; i<arr.length; i++){
            count++;
 sum+=arr[i];
           
        }
        System.out.println("Average is"+ sum/count);
    }
}
