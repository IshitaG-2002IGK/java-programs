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

class A extends Thread 
{
    public void run()
    {
        int num = 0;
        Random r = new Random();
        try 
        {
            for (int i=0; i<5; i++)
            {
                num = r.nextInt(100);
                System.out.println("Main Thread and Generated number is :" +num);
                if(num %2 ==0)
                {
                    Thread t1 = new Thread( new even (num));
                    t1.start();

                }
                else
                {
                    Thread t2 = new Thread( new odd (num));
                    t2.start();
                }
                Thread.sleep(1000);
                System.out.println("-------------------------------");
      
            }
        }
        catch (Exception e)
        {
            System.out.println(ex.getMessage());

        }
    }
}

public class JavaThread
{
    public static void main( Srting args [])
    {
        A a = new A ();
        a.start();
        
    }
}