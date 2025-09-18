abstract class shape{
    int x=10;
    int y=20;
    abstract void pirntArea();
}
class Rectangle extends shape{
    public void pirntArea(){
        int vol=x*y;
        System.out.println( "The Area of Rectangle is:"+vol);
    }
}
class Circle extends shape{
    public void pirntArea(){
         double vol=3.14*x*x;
        System.out.println( "The Area of Circle is:"+vol);
         
    }
}
class Trinagle extends shape{
    public void pirntArea(){
        double vol=0.5 *x*y;
        System.out.println( "The Area of Trinagle is:"+vol);
         
    }
}
public class AbstractionMain{
    public static void main(String[] args){
        Rectangle r =new Rectangle();
        r.pirntArea();
        Circle c= new Circle();
        c.pirntArea();
        Trinagle t= new Trinagle();
        t.pirntArea();
    }
}