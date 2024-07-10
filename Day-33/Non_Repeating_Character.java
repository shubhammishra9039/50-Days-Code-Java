import java.util.Scanner;

public class Non_Repeating_Character {

        public static void rept(String s)
        {
            for (int i=0;i<s.length();i++)
            {
                int cont=0;
                for (int j=0;j<s.length();j++)
                {
                    if (i!=j && s.charAt(i)==s.charAt(j))
                    {
                        cont++;
                        break;
                    }
                }
                if (cont==0)
                {
                    System.out.print(s.charAt(i));
                }
            }


        }


    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter A String");
        String s=kb.nextLine();
        System.out.println("String is "+s);
        rept(s);

    }
}
