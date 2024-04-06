public class Finlazed_method_exmple {
    public static class Empnew
    {
        private int age;
        private String name;
       private int id;
       private static int nextId=1;
       public void setData(int a,String s)
       {
           age=a;
           name=s;
           id=nextId;
           nextId++;

       }

       public void showData()
       {
           System.out.println("Age is = "+age +" Name Is = "+name+ " Id Is = "+id);
       }

       public static void main(String args [])
       {
           Empnew obj1=new Empnew();
           Empnew obj2=new Empnew();
           Empnew obj3=new Empnew();
           obj1.setData(27,"shubham");
           obj2.setData(25,"Shyam");
           obj3.setData(19,"Manish");

           obj1.showData();
           obj2.showData();
           obj3.showData();
       }
    }
}
