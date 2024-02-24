public class OppsEx1 {
    public void coll_hike()
    {
        System.out.println("Super Class");
    }
}

class Maneger extends OppsEx1{
    @Override
    public void coll_hike() {
        System.out.println("Base Class");
    }
}
class Main
{
    public static void main(String[] args) {
        OppsEx1 obj =new Maneger();
        obj.coll_hike();
    }
}
