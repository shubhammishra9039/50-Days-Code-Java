import java.util.Scanner;

public class Count_Vowels_and_Consonants {

    public  static  void count(String s)
    {
        int vow=0, con=0;
        for (int i=0;i<s.length();i++)
        {
            char a =s.charAt(i);
            if(a=='a'||a=='e' ||a=='i'||a=='o'||a=='u'||a=='A'||a=='E' ||a=='I'||a=='O'||a=='U')
            {
                vow++;
            }
            else
            {
                con++;
            }

        }
        System.out.println("Vowel Is "+vow+"\n consonats is "+con);
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter A String :");
        String s=kb.nextLine();
        count(s);
    }
}
