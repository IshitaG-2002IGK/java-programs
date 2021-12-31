import java.util.*;

class even implements Runnable 
{
    public int x;
    public even (int x);
    {
        this.x = x;

    }
    public void run()
    {
        System.out.println(" Square is :" + x*x);
    }
}

class odd implements Runnable 
{
    public int x;
    public odd (int x);
    {
        this.x = x;

    }
    public void run()
    {
        System.out.println(" Cube is :" + x*x*x);
    }
}

class A