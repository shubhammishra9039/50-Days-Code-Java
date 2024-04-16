//Print a Pattern
//Write a method that prints the following pattern up to n lines (for n=5):
//markdown
//Copy code
// *
// **
// ***
// ****
// *****


public class Print_a_Pattern {
    public static void main(String[] args) {
        int line=4;
      for (int i=0;i<=line;i++)
      {
          for (int j=0;j<=i;j++) {
              System.out.print(" *");
          }
          System.out.println();
      }

    }
}
