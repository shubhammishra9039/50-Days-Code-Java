public class Prime {
    public static void main(String[] args) {
        int num=11;
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                System.out.println("is not a prime number");
                break;
            }else{
                System.out.println("is a prime number");
                break;
            }
        }
    }
}
