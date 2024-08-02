public class CopyArray {
    public static void main(String[] args) {
        int arr[]=new int[]{2,4,5,7,4,3,46,67,22};
        int brr[]=new int[arr.length];
        for(int i=0; i<arr.length; i++){
           brr[i]=arr[i];
        }
        for(int i=0; i<brr.length; i++){
            System.out.print(brr[i]+" ");
        }
    }
}
