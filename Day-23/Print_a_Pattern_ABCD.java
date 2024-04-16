//Print a Pattern
//Write a method that prints the following pattern up to n lines (for n=5):
//markdown
//Copy code
// A
// BC
// DEF
// GHIJ
// KLMNO


public class Print_a_Pattern_ABCD {
    public static void main(String[] args) {
        char ch='A';
        for (int i=0;i<5;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
