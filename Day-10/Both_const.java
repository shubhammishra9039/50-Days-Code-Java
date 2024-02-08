public class Both_const {
    private int l,b,h;
    public Both_const(){
        l=b=h=10;
        System.out.println(" Lenth Is "+l+" Hight Is ="+b+" Brith is ="+h);
    }
    public Both_const(int a,int c, int d){
        l=a;
        b=c;
        h=d;
        System.out.println(" Lenth Is "+l+" Hight Is ="+b+" Brith is ="+h);
    }
    public Both_const( Both_const p){
      l= p.l;
      b= p.b;
      h= p.h;
        System.out.println(" Lenth Is "+l+" Hight Is ="+b+" Brith is ="+h);
    }
}
