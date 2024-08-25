// palindrome number
public class code4 {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        int c = num;

        while (num > 0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num /= 10;

        }
        if (c == sum) {
            System.out.println(c + ":is a palindrom");
        } else {
            System.out.println(c + ":is not a palindrom");
        }
    }

}
