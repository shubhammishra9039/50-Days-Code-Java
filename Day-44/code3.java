// 1 to 100 prime numbers
public class code3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isprime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
