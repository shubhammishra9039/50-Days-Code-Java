import java.util.Scanner;

class Root{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        System.out.println("enter c");
        int c=sc.nextInt();

        int discriminant=b*b-4*a*c;

        if(a==0){
            System.out.println("this is not a quadratic equation");
        }
        else if(discriminant>0){
            double root1=(-b+Math.sqrt(discriminant))/(2*a);
            double root2=(-b-Math.sqrt(discriminant))/(2*a);

            System.out.println("root1 is: "+root1);
            System.out.println("root2 is: "+root2);
        }else {
            double img=(Math.sqrt(-discriminant)/(2*a));
            System.out.println(img);
        }
    }
}