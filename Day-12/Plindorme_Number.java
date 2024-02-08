import java.util.Scanner;

public class Plindorme_Number {
    public static class cherk
    {
        public int plindorme(int n)
        {
            int tem=0;
            int num=0;
            while (n!=0)
            {
                tem=n%10;
                num=num*10+tem;
                n=n/10;
            }
            return num;
        }
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n= kb.nextInt();
        cherk obj=new cherk();

        int palindore=obj.plindorme(n);
        System.out.println("Number Is "+n+" Palindorm Number Is "+palindore);
    }

}
