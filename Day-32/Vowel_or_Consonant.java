import java.io.IOException;
import java.util.Scanner;

public class Vowel_or_Consonant {

    public  static  String vowel_Consonant(int a)
    {
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='A'||a=='E'||a=='O' || a=='U')
            return "vowel";
        else
            return "consonant";
    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter A Character :");
        char a=  (char)System.in.read();
        String result=  vowel_Consonant(a);
        System.out.println("Result Is :"+result);

    }
}
