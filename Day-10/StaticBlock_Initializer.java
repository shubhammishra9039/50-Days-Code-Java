class Block{
private  int speed;
private String location;
    {
        System.out.println("Satic Block......");
        speed=20;
        System.out.println("speed is"+speed);
    }

    public Block(int s){
        speed=s;
        System.out.println("One Pramiter...");
        System.out.println("one speed is"+speed);
    }
    public Block(int s,String l)
    {
        System.out.println("Two Pramiter...");
        speed=s;
        location=l;
        System.out.println("speed is"+speed+" Name Is="+location);
    }


}

public class StaticBlock_Initializer {
    public static void main(String[] args) {
        Block obj=new Block(40);
        Block obj1=new Block(30,"Shubham");

    }

}
