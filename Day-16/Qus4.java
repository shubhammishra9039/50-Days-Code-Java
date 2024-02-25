
//4- Accept the User's name, age and print in following manner
//        Ex - Hello Shery, you are 12 years old.

import java.util.Scanner;

public class Qus4 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Name :");
        String name = kb.next();
        System.out.println("Enter Age");
        int age = kb.nextInt();
        System.out.println("Hello "+name+" You are "+age+" yers old .");

    }
}
