import java.util.*;

class Demo {
    public static void main(String ts7[]) {
        int ch;

        Rectangle ob1 = new Rectangle();

        Triangle ob2 = new Triangle();

        Circle ob3 = new Circle();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter:\n1.Rectangle\n2.Triangle\n3.Circle\nEnter your Choice:");


        ch = sc.nextInt();

        switch (ch) {

            case 1:
                ob1.printArea();
                break;



            case 2:
                ob2.printArea();
                break;



            case 3:
                ob3.printArea();
                break;



            default:
                System.out.println("Wrong Choice!");
        }



    }
}



abstract class Shape {



    int i1, i2;



    abstract void printArea();
}

class Rectangle extends Shape {

    Scanner sc = new Scanner(System.in);

    int area = 0;public class internal {
    
}

    void printArea() {


        System.out.println("Enter length of the Rectangle:");

        i1 = sc.nextInt();

        System.out.println("Enter breadth of the Rectangle:");

        i2 = sc.nextInt();

        area = i1 * i2;

        System.out.println("Area of the rectangle:" + area);
    }
}


class Triangle extends Shape {

    Scanner sc = new Scanner(System.in);



    int area = 0;



    void printArea() {



        System.out.println("Enter height of the Triangle:");



        i1 = sc.nextInt();



        System.out.println("Enter base of the Triangle:");



        i2 = sc.nextInt();



        area = (i1 * i2) / 2;



        System.out.println("Area of the Triangle:" + area);

    }
}

class Circle extends Shape {

    Scanner sc = new Scanner(System.in);

    double area = 0;
    void printArea() {

        System.out.println("Enter radius of the Circle:");

        i1 = sc.nextInt();

        area = (22 * i1 * i1) / 7;

        System.out.println("Area of the Circle:" + area);



    }
}




