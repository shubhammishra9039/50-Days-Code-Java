public class OddArray {
    public static void main(String[] args) {
        int arr[]=new int[]{2,3,4,56,7,56,3,23,45,7};
        System.out.println("odd number are");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
System.out.print(arr[i]+" ");
            }
        }
    }
}
