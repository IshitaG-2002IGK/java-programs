import java.util.Scanner;
import java.util.ArrayList;

public class stropr 
{
    private static ArrayList< String > var = new ArrayList <> ();
    private static Scanner sc = new Scanner (System.in);
    private static void append ()
    {
        System.out.println( "Enter the string to append");
        String str = sc.next();
        var.add(str);
        System.out.println( "Appended Successfully");

    }
    private static void add ()
    {
        System.out.println( "Enter the string to add");
        String str = sc.next();
        var.add(str);
        System.out.println( "Enter the index of the string ");
        int i = sc.nextInt();
        var.add(i,str);
        System.out.println( "Added Successfully!! ");

    }

    private static void search ()
    {
        System.out.println("Enter the strong to search for");
        String str = sc.next();
        int no =var.indexOf(str);
        System.out.println("Found in Index postion " +no);

    }

    private static void display()
    {
        for(String a : var)
        System.out.println(a);
    }

    public static void main
}
