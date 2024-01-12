public class Character_Pattern {
    public static void main(String[] args) {
        char a=65;
        for (int i=1;i<=4;i++)
        {

            for (int j =1;j<=i;j++)
            {
                System.out.print(a);
                a++;
            }
            System.out.println(" ");
        }
    }
}
