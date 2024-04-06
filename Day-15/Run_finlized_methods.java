public class Run_finlized_methods {
    public static class Work
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
            System.out.println("Age is "+age+" Name IS "+name+" Id Is "+id);
        }

        public int getId() {
            return id;
        }
    }
    public static void main(String[] args) {
        Work obj1=new Work();
        Work obj2=new Work();
        Work obj3=new Work();

        obj1.setData(27,"shubha");
        obj3.setData(21,"Ram");
        obj2.setData(30,"Shyam");
        System.out.println(obj3.getId());
        {
            Work obj4=new Work();
            Work obj5=new Work();
            obj4.setData(20,"Rakhi");
            obj5.setData(21,"Poorvi");
            obj4.showData();
            obj5.showData();
            System.out.println(obj4.nextId);
            System.out.println(obj5.nextId);

        }
        System.out.println(obj3.nextId);

    }
}
