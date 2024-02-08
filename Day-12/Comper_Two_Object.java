public class Comper_Two_Object {
    public static class Emp
    {
        private int age;
        private String name;
        public Emp(int age,String name)
        {
            this.age=age;
            this.name=name;
        }

        public void show()
        {
            System.out.println("Age Is = "+age+" Name is ="+name);
        }
        public boolean objecomper(Object obj2)
        {
            Emp tem=(Emp) obj2;
            if (this.age==tem.age && this.name==tem.name)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        Emp obj1=new Emp(27,"Shubham");
        Emp obj2=new Emp(28,"Shubham");
        System.out.println(obj1.objecomper(obj2));


    }

}
