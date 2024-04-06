import java.util.Scanner;

public class Use_Circle {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter A radius ");
        int r =kb.nextInt();
        Circle obj=new Circle();
        obj.setDate(r);
        obj.radius();
        obj.cir();
    }

}
