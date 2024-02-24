public class Expilcit_insliztion {
    public  static class  test{
        private int a =10;
         private String n="Shubham";

        public void show()
        {
            System.out.println("Age is = "+a+" Name Is = "+n);
        }


    }
    public  static void main(String[] args) {
        test obj=new test();
        obj.show();


    }
}
