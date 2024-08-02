public class CubicElements {
    public static void main(String[] args) {
        int arr[]=new int[]{2,3,4,5,6,7,8,9};
        for(int i=0; i<arr.length; i++){
            double cube=(Math.pow(arr[i], 3));
            System.out.println("cube of "+ arr[i]+" is "+ (int)(cube));
        }

    }
}
