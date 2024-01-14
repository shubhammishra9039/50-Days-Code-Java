public class Optimized_Prime_Number {
    public static boolean prime(int n){
        if(n==2)
            return true;
        else
        {
            for(int i=2;i<n;i++){
                if(n%i==0)
                {
                    return false;
                }
            }

        }
        return true;
    }
    public static void main(String[] args) {
        boolean r=prime(11);
        if(r==false){
            System.out.println("Number Is Not Prime");
        }
        else
            System.out.println("Number Is Prime");
    }
}


