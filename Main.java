mport Year_I.YearIMarks;
import Year_II.YearIIMarks;
import java.util.Scanner;
class Student{
int rollNumber;
String name;
YearIMarks yearIMarks = new YearIMarks();
YearIIMarks yearIIMarks = new YearIIMarks();
}
public class Main {
public static void main(String[] args) {
int sub[] = new int[4];
System.out.println("Enter the number of students:");
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
for(int i =0; i<n; i++) {
System.out.println("\nEnter Student " +(i+1)+ " Details:");
Student student = new Student();
System.out.println("Enter Name: ");
student.name = scan.next();
System.out.println("Enter Roll No.:");
student.rollNumber = scan.nextInt();
sub[0] = student.yearIMarks.sub1mark();
sub[1] = student.yearIMarks.sub2mark();
sub[2] = student.yearIIMarks.sub3mark();
sub[3] = student.yearIIMarks.sub4mark();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~MARKSHEET~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.print("NAME: " + student.name+ "\t");
System.out.print("ROLL NO: " + student.rollNumber + "\n");
for(int j=0; j<4; j++){
if(sub[j]<=50){
System.out.println("Subject" +(j+1)+ ": Fail");
}
else{
System.out.println("Subject" +(j+1)+ ": Pass");
}
}
System.out.println("-------------END OF REPORT-------------");
}
}
}







