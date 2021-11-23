package SampleCodes;

import java.util.Stack;

public class Stack_Sample {
    public static void main(String[] args) {
        Stack shapes = new Stack();
        shapes.push("Triangle");
        shapes.push("Circle");
        System.out.println(shapes.peek() + " is at top of the stack.");
        shapes.pop(); //removes Circle from the stack
        System.out.println("The stack contains: " + shapes);
    }
}
