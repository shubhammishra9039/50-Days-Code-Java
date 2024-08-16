public class ReverseArray {
    public static void main(String[] args) {
        int arr[]=new int[]{2,4,5,6,3,8,9,5,4};
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
