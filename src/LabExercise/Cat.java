package LabExercise;

public class Cat extends Pet {
    public Cat() {
        System.out.println("Cat");
    }

    public static void main(String[] args) {
        new Pet(5);
    }
}

class Pet {
    public Pet() {
    }

    public Pet(int age) {
        System.out.print("Pet");
    }
}
