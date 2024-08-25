// armstrong  
public class code6 {
    public static int countdigit(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;

        }
        return count;
    }

    public static void main(String[] args) {
        int num = 153;
        int digit = countdigit(num);

        int c = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = (int) (sum + Math.pow(rem, digit));
            num /= 10;
        }
        if (c == sum) {
            System.out.println("armstrong");
        } else {
            System.out.println("not a armstrong");
        }
    }
}
