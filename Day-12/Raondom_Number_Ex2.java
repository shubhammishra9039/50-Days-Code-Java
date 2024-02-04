import java.util.Random;

public class Raondom_Number_Ex2 {
    public static void main(String[] args) {
        Random obj=new Random();
        int x=(int)(obj.nextInt(5000));
        System.out.println(x);
        int y=(int)(obj.nextInt(7000));
        System.out.println(y);

    }
}
