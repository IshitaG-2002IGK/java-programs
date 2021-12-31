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

    public static void main (String args [])
    {
        int ch;
        try
        {
            do{
                System.out.println( "MENU \n1. Append \n2. Add \n3. Search \n4. Display \n5. Exit");
                System.out.println( "Enter your choice : ");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1 :
                             append();
                             break;
                    case 2 :
                             add();
                             break;

                    case 3 :
                             search();
                             break;
                    
                    case 4 :
                             display();
                             break;

                    case 4 :
                             display();
                             break;
                    
                    case 5 :
                            exit(0);
                    
                    default :
                            System.out.println("Invalid output");
                            break;


                            
                }
            } while (true);
        }
        catch (Exception e)
        {
            System.out.println (e);
        }
    }
}
