package CircleMaster;

class CircleThingy
{
    double Rad;
    final double pi= (double) 3.14;
    CircleThingy()
    {
        Rad=1;
    }
    CircleThingy(double Rad)
    {
        this.Rad=Rad;
    }
    double getArea()
    {
        return(pi*Math.pow(Rad,2));
    }
    double getPeri()
    {
        return(2*pi*Rad);
    }
}
public class Circle {
    public static void main(String[] args) {
        CircleThingy C = new CircleThingy(5.56);
        System.out.println("The Area of Circle is :" + C.getArea());
        System.out.println("The Perimeter of Circle is :" + C.getPeri());
    }

}
