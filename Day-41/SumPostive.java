public class SumPostive {
    public static void main(String[] args) {
        int arr[]=new int[]{2,4,-4,23,-8,-7,56,5,4,3,2};
        System.out.println("they are positive number");
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                 System.out.print(arr[i]+=arr[i]);
                
            }
            
        }
    }
}
