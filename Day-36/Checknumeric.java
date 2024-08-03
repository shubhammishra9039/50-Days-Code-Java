public class Checknumeric {
    public static void main(String[] args) {
        String str="34998";
        boolean isNumeric= str.matches("[0-9]+");
        System.out.println(isNumeric);
    }
}
