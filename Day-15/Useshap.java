//Q.1 Implement a class representing a basic geometric shape,
// such as a circle or rectangle. Include methods to calculate
// area and perimeter.


 abstract  class shap {
   public  abstract double area();
   abstract double perimeter();

}

class circle extends shap
{
    private int radius;
    public circle(int r)
    {
        radius=r;
    }

    @Override
    public double area() {
        return 2*Math.PI*Math.pow(radius,2);
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}

class rectangle extends shap
{
    private int lenght;
    private int width;
    public rectangle(int len,int widt)
    {
        lenght=len;
        width=widt;
    }
    public double area()
    {
        return lenght*width;
    }
    public double perimeter()
    {
        return 2*(lenght + width);
    }
}

class Useshap
{
    public static void main(String[] args) {
        int result;

        shap s=new circle(7);
        System.out.println("Circle area = "+s.area());
        System.out.println("Circle Prameter = "+s.perimeter());
        s=new rectangle(10,20);
        System.out.println(" RactAngle are"+s.area());
        System.out.println(" RactAngle Prameter"+s.perimeter());

    }
}