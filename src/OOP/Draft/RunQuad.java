package OOP.Draft;

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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select from the following:\n" +
                "R - Rectangle\n" +
                "S - Square\n" +
                "P - Parallelogram\n" +
                "H - Rhombus\n" +
                "T - Trapezoid");
        String shape = scanner.nextLine();
        if (shape.equalsIgnoreCase("R")) {
            Rectangle r = new Rectangle();
            System.out.println("A rectangle:");
            r.showDescription();
        } else if (shape.equalsIgnoreCase("S")) {
            Square s = new Square();
            System.out.println("A square:");
            s.showDescription();
        } else if (shape.equalsIgnoreCase("P")) {
            Parallelogram p = new Parallelogram();
            System.out.println("A parallelogram:");
            p.showDescription();
        } else if (shape.equalsIgnoreCase("H")) {
            Rhombus h = new Rhombus();
            System.out.println("A rhombus:");
            h.showDescription();
        } else if (shape.equalsIgnoreCase("T")) {
            Trapezoid t = new Trapezoid();
            System.out.println("A trapezoid:");
            t.showDescription();
        }
    }
}
