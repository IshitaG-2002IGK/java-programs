import java.util.Scanner;
public class internal2
{
public static void main(String[] args) {

Scanner in=new Scanner(System.in);
String name;
int days,num,work;
System.out.println("Enter the name of the student: ");
name=in.next();
System.out.println("Enter the Register No of the student: ");
num=in.nextInt();
System.out.println("Enter the total number of working days: ");
work=in.nextInt();
System.out.println("Enter total number of according days present: ");
days=in.nextInt();
double attendance_perc=(work*days)/7.0;
int marks=0;
if (attendance_perc>=90){
marks=5;
}
else if(attendance_perc>=80){
marks=4;
}
else if(attendance_perc >=70) {
marks=3;
}
System.out.println("Name: "+name);
System.out.println("Register Number:"+num);
System.out.println("Number of days: "+days);
System.out.println("Marks: "+marks);

}
}

