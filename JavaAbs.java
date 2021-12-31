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
        area = x*y;
        System.out.println ("Area of retangle is :" +area)
    }


}
