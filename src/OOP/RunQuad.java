package OOP;

import java.util.Scanner;

//parent class of Trapezoid and Parallelogram
class Quadrilateral {
    public void showDescription() {
        System.out.println("- is quadrilateral");
    }
}

//child class of Quadrilateral
class Trapezoid extends Quadrilateral {
    public void showDescription() {
        System.out.println("- has 1 pair of parallel sides");
        super.showDescription();
    }
}

//child class of Quadrilateral and parent class of Rectangle and Rhombus
class Parallelogram extends Quadrilateral {
    public void showDescription() {
        System.out.println("- has 2 pairs of parallel sides");
        super.showDescription();
    }
}

//child class of Parallelogram
class Rhombus extends Parallelogram {
    public void showDescription() {
        System.out.println("- has 4 congruent sides");
        super.showDescription();
    }
}

//child class of Parallelogram and parent class of Square
class Rectangle extends Parallelogram {
    public void showDescription() {
        System.out.println("- has 4 right angles");
        super.showDescription();
    }
}

//child class of Rectangle
class Square extends Rectangle {
    public void showDescription() {
        System.out.println("- has 4 equal sides");
        super.showDescription();
    }
}

//this is the class where main method should be
public class RunQuad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select from the following:\n" +
                "R - Rectangle\n" +
                "S - Square\n" +
                "P - Parallelogram\n" +
                "H - Rhombus\n" +
                "T - Trapezoid");
        switch (input.nextLine().toUpperCase()) {
            case "R":
                Rectangle rectangle = new Rectangle();
                System.out.println("A rectangle:");
                rectangle.showDescription();
                break;
            case "S":
                Square square = new Square();
                System.out.println("A square:");
                square.showDescription();
                break;
            case "P":
                Parallelogram parallelogram = new Parallelogram();
                System.out.println("A parallelogram:");
                parallelogram.showDescription();
                break;
            case "H":
                Rhombus rhombus = new Rhombus();
                System.out.println("A rhombus:");
                rhombus.showDescription();
                break;
            case "T":
                Trapezoid trapezoid = new Trapezoid();
                System.out.println("A trapezoid:");
                trapezoid.showDescription();
                break;
            default:
                System.out.println("Invalid Input!");
        }
    }
}
