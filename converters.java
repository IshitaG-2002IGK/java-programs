import java.util.Scanner;
public class converters
{
public static void main(String args[])
{
double INR,USD,YEN,EURO,Meter,Km,Hr,Min,Sec;
int ch;
Scanner in=new Scanner(System.in);
System.out.println("Enter your choice:");
System.out.println("1.USD to INR \n2.EURO to INR\n3.YEN to INR\n");
ch=in.nextInt();
switch(ch)
{

case 1:
System.out.println("USD to INR");
System.out.println("Enter the USD:");
USD=in.nextDouble();
INR=USD*60;
System.out.println("The INR value is "+INR);
System.out.println("INR to USD");
System.out.println("Enter the INR: ");
INR=in.nextDouble();
USD=INR/60;
System.out.println("The value of usd is "+USD);
break;



case 2:
System.out.println("EURO to INR");
System.out.println("Enter the EURO:");
EURO=in.nextDouble();
INR=EURO*80.78;
System.out.println("The INR value is "+INR);
System.out.println("INR to EURO");
System.out.println("Enter the INR: ");
INR=in.nextDouble();
EURO=INR/80.78;
System.out.println("The value of EURO is "+EURO);
break;


case 3:
System.out.println("YEN to INR");
System.out.println("Enter the YEN:");
YEN=in.nextDouble();
INR=YEN/1.64;
System.out.println("The INR value is "+INR);
System.out.println("INR to YEN");
System.out.println("Enter the INR:");
INR=in.nextDouble();
YEN=INR*1.64;
System.out.println("The value of yen is "+YEN);
break;
}

}


}





