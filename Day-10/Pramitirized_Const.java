
class demo{
    private int age;
    private String name;
    private double sal;
    public demo(int a,double s,String n){
        age=a;
        name=n;
        sal=s;
    }

    public void show() {
        System.out.println("Age Is "+age+" Name Is "+name+" Salary Is ="+sal);

    }
}
public class Pramitirized_Const {
    public static void main(String[] args) {
        demo obj=new demo(27,4500.00,"Shubham");
        obj.show();
        demo obj1=new demo(23,2500.00,"Mishto");
        obj1.show();
    }
}
