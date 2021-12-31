import java.util.*;
abstract class Shape
{
    public int x,y;
    public abstract void printarea();

}

class rectangle extends Shape 
{
    public void printarea()
    {
        float area;
        area = x*y;
        System.out.println ("Area of retangle is :" +area)
    }


}

class triangle extends Shape 
{
    public void printarea()
    {
        float area;
        area = 0.5*x*y;
        System.out.println ("Area of retangle is :" +area)
    }


}


public class JavaAbs
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the two numbers:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        rectangle r = new rectangle();
        r.x = x1 ;
        r.y = y1 ;
        r.printarea();
        triangle t = new triangle();
        t.x = x1;
        t.y = y1 ;
        t.printarea();
    }

}

