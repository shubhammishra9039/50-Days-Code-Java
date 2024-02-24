import java.sql.SQLOutput;
import java.util.Scanner;

class Arry{
    private int Age;
    private String name;

    public Arry(int a,String s)
    {
        Age=a;
        name=s;
    }

    public void show(){
        System.out.println("Age Is = "+Age+" Name Is "+name);
    }
}



public class Array_Refrence {
    public static void main(String[] args) {
        // Array Type se v Obj ke 1 se jada Refernce Bana skte h
        Arry[] obj = new Arry[2];
        Scanner kb = new Scanner(System.in);
        int a;
        String name;
        for (int i = 0; i < 2; i++) {
            a = kb.nextInt();
            name = kb.nextLine();
            obj[i] = new Arry(a, name);

        }

        for ( Arry l:obj)
        {
            l.show();

        }

    }
}