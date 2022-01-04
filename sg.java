import java.util.Scanner;

public class sg
{

    public static void main(String[] args) {
        Scanner ed = new Scanner(System.in);
        String name;
        int marks = 0, subjectCount;
        double avg;
        System.out.print("Enter name of the Student = ");
        name = ed.next();
        System.out.print("Enter Number of Subjects = ");
        subjectCount = ed.nextInt();
        System.out.println("Now, Number Out of 100 in following subjects :- ");
        for (int i = 0; i < subjectCount; i++) {
            marks += ed.nextInt();
        }
        avg = ((double) marks) / subjectCount;
        System.out.println("Name = " + name);
        System.out.println("Total marks " + marks);
        if (avg > 80 && avg <= 100) {
            System.out.println("Grade = A");
        } else if (avg > 60 && avg <= 80) {
            System.out.println("Grade = B");
        } else if (avg > 30 && avg <= 60) {
            System.out.println("Grade = C");
        } else if (avg >= 0 && avg <= 30) {
            System.out.println("Grade = D");
        }
    }
}

