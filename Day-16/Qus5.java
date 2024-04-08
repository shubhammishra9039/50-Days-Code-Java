import java.util.Scanner;

//5- Accept the length and width of a rectangle.
// Calculate & print the area and perimiter.
public class Qus5 {
    public static void area(int len,int widht)
    {
        System.out.println(" Area Is ="+(len*widht));
    }
    public static void perimiter(int len,int widht)
    {
        System.out.println("Perimiter ="+(2*(len+widht)));
    }

    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter Lenght");
        int len= kb.nextInt();
        System.out.println("Enter Widht:");
        int widht= kb.nextInt();
        area(len,widht);
        perimiter(len,widht);
    }
}
