// prime number
public class code2 {
    public static void main(String[] args) {
        boolean isPrime = true;
        int num = 12;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + ":is a prime number");
        } else {
            System.out.println(num + ":is not a prime number");
        }
    }
}
