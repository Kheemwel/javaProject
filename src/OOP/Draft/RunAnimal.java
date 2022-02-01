package OOP.Draft;

import java.util.Scanner;

abstract class Animal {
    public abstract String eat();

    public abstract String sleep();

    public abstract void makeSound();
}

class Bird extends Animal {
    @Override
    public String eat() {
        return "seeds";
    }

    @Override
    public String sleep() {
        return "10-12";
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet tweet");
    }
}

class Cat extends Animal {
    @Override
    public String eat() {
        return "fish";
    }

    @Override
    public String sleep() {
        return "12-16";
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}

class Dog extends Animal {

    @Override
    public String eat() {
        return "meat";
    }

    @Override
    public String sleep() {
        return "12-14";
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

public class RunAnimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
        String s = input.nextLine();
        if (s.equalsIgnoreCase("B")) {
            Bird bird = new Bird();
            System.out.println("Bird love to eat " + bird.eat() + " and sleep for " + bird.sleep() + " hours a day.");
            bird.makeSound();
        } else if (s.equalsIgnoreCase("C")) {
            Cat cat = new Cat();
            System.out.println("Cat love to eat " + cat.eat() + " and sleep for " + cat.sleep() + " hours a day.");
            cat.makeSound();
        } else if (s.equalsIgnoreCase("D")) {
            Dog dog = new Dog();
            System.out.println("Dog love to eat " + dog.eat() + " and sleep for " + dog.sleep() + " hours a day.");
            dog.makeSound();
        }
    }
}
