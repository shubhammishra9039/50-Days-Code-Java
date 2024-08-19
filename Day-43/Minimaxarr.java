class Minimaxarr{
  public static void main(String args[])    {
    int arr[]={23,44,6,7,11,59,56,3};
int max=arr[0];
int min=arr[0];
    for(int i=0; i<=arr.length-1; i++){
       if(arr[i]>max){
        max=arr[i];
       }
       if(arr[i]<min){
        min=arr[i];
           }
    }
    System.out.println("max is"+max);
    System.out.println("min is"+min);

  }
}