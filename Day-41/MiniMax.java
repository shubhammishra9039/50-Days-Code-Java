public class MiniMax {
    public static void main(String[] args) {
        int min;
        int max;
        int arr[]=new int[]{2,4,5,6,8,9,56,454,3,545};
        min=arr[0];
        max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(min>=arr[i]){
min=arr[i];
            }else{
                max=arr[i];
            }
        }
        System.out.println("max is "+max);
        System.out.println("min is "+min);
    }
}
