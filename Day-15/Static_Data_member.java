public class Static_Data_member {
    public static class Emp{
        int a;
        static  int b;


    }
    public static void main(String[] args) {

        Emp d1=new Emp();
        Emp d2=new Emp();
        Emp d3=new Emp();
        d1.a=10;
        d2.a=20;
        d3.a=30;


        d1.b=10;
        d2.b=20;
        d3.b=30;

        System.out.println(d1.a);
        System.out.println(d2.a);
        System.out.println(d3.a);



        System.out.println(d1.b);
        System.out.println(d2.b);
        System.out.println(d3.b);
    }
}
