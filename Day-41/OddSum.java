public class OddSum {
    
        public static void main(String[] args) {
            int sum=0;
            int arr[]=new int[]{2,3,4,56,7,56,3,23,45,7};
            System.out.println("odd number are");
            for(int i=0; i<arr.length; i++){
                if(arr[i]%2!=0){
                   
                    sum+=arr[i];
    System.out.print(arr[i]+" ");
    
                }
               
            }
            System.out.println("sum is "+ sum);
        }
    }
    

