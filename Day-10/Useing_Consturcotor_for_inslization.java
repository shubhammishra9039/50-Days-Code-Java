import java.sql.SQLOutput;

public class Useing_Consturcotor_for_inslization {
    public static class Demo
    {
        private  int Age;
        private  String name;
        public Demo(int a,String n)
        {
            System.out.println("Consturctor Colling.....");
            Age=a;
            name=n;

        }
        public void show()
        {
            System.out.println("Age Is ="+Age+" Name Is = "+name);

        }
    }
    public static void main(String[]args)
    {
        Demo obj=new Demo(27,"Shubham");
        obj.show();
    }
}
