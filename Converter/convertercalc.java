package Converter;
import java.util.Scanner;

public class convertercalc
{
    public static void calculate()
    {
        double inr, usd, meter, km, hr, sec, min;
        int ch;
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter your choice");
        System.out.println("Enter your choice");
        System.out.println("1. usd to inr \n2. meter to km \n3. hrs to min and sec");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1 :
                    System.out.println("USD TO INR");
                    System.out.println("Enter the USD");
                    usd = sc.nextDouble();
                    inr =  usd * 60;
                    System.out.println("The INR is :" + inr);
                    System.out.println("INR to USD");
                    System.out.println("Enter the INR");
                    inr = sc.nextDouble();
                    usd =  inr/60;
                    System.out.println("The USD is :" + usd);
                    break ;
            
            case 2 :

                    System.out.println("Meters to km");
                    System.out.println("Enter the meters");
                    meter = sc.nextDouble();
                    km =  meter / 1000;
                    System.out.println("The km is :" + km);
                    System.out.println("km to Meters");
                    System.out.println("Enter the km");
                    km = sc.nextDouble();
                    meter =  km * 1000;
                    System.out.println("The meter is :" + meter);
                    break ;

            case 3 :
                    System.out.println("Hours to mins and seconds");
                    System.out.println("Enter the hours");
                    hr = sc.nextDouble();
                    min = hr * 60 ;
                    sec = hr * 3600 ;
                    System.out.println("The minutes is  :" + min);
                    System.out.println("The seconds is :" + sec);
                    break ;



        }



    }
}