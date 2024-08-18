public class ArraySum {
    public static void main(String[] args) {
        int sum=0;
        int arr[]=new int[]{2,5,7,3,7,9,5,3,24};
        for(int i=0; i<arr.length; i++){
          sum+=arr[i];
        }
        System.out.println("sum is:"+sum);
    }
}
