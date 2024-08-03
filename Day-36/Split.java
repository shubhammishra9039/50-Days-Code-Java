import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String str="hello-world-shrishti";
        String newString[]=str.split("-");
        System.out.println(Arrays.toString(newString));
    }
}
