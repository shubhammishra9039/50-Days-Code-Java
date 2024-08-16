public class MergeArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int brr[]={6,7,8,9,10};
        int crr[]=new int[arr.length+brr.length];
        for(int i=0; i<arr.length; i++){
            crr[i]=arr[i];
        }
            for(int j=0; j<brr.length; j++){
                crr[arr.length+j]=brr[j];
            }
        
            for(int i=0; i<crr.length; i++){
System.out.println(crr[i]);
            }
        
    }
}
