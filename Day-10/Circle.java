public class Circle {
    private int r;

    public void setDate(int n)
    {
        r=n;
    }
    public void radius()
    {
        double c=2*Math.PI*Math.pow(r,2);
        System.out.println("The Radius Is = "+c);
    }

    public void cir()
    {
        double b=2*Math.PI*r;
                System.out.println("Cir Is = "+b);
    }


}
