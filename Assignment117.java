package Javaassignments;

//WAP on Run time polymorphism (Method overriding)
// Parent class
public class Assignment117 {
    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Assignment117 {
    // Overriding the makeSound method
    
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Assignment117 {
    // Overriding the makeSound method

    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class with the main method
class MainClass {
    public static void main(String[] args) {
        // Parent class reference, child class objects
        Assignment117 myAnimal;

        myAnimal = new Dog();
        myAnimal.makeSound();  // Output: Dog barks

        myAnimal = new Cat();
        myAnimal.makeSound();  // Output: Cat meows
    }
}
