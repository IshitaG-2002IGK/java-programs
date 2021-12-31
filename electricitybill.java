import java.util.*;
import java.io.*;
import java.lang.Math;

public class electricitybill 
{   
    public static void main(String args[])
    {
        int cno, prev, curr, diff;
        String cname;
        double amount =0.0;
        boolean ctype;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Customer Name :");
        cname = sc.nextLine();
        System.out.println("Enter the Customer Number:");
        cno = sc.nextInt();
        System.out.println("Enter the Previous Reading :");
        prev = sc.nextInt();
        System.out.println("Enter the Current Reading :");
        curr = sc.nextInt();
        // System.out.println("Enter the Difference amount :");
        // diff = sc.nextInt();
        System.out.println("Enter the Connection type (commerical - true / domestic - false) :");
        ctype = sc.nextBoolean();
        diff = Math.abs ( prev - curr );
        if ( ctype == true)
        {
            if ( diff < 101)
            {
                amount = diff *2 ;
            }
            else if (diff < 201 && diff > 100)
            {
                amount = diff * 4.5;

            }
            else if (diff < 501 && diff > 200)
            {
                amount = diff * 6;

            }
            else if (diff > 500)
            {
                amount = diff * 7;

            }
            else
            {
                System.out.println ("Sorry not sorry");
            }
        }
        if ( ctype == false)
        {
            if ( diff < 101)
            {
                amount = diff * 1 ;
            }
            else if (diff < 201 && diff > 100)
            {
                amount = diff * 2.5;

            }
            else if (diff < 501 && diff > 200)
            {
                amount = diff * 4;

            }
            else if (diff > 500)
            {
                amount = diff * 6;

            }
            else
            {
                System.out.println ("Sorry not sorry");
            }
        }

        System.out.println("The amount is: " + amount);
        




    
    
    
    }
}