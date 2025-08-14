// File: AdvancedVehicle.java
package org.example;

// Abstract class definition
public abstract class AdvancedVehicle {
    private String brand;
    private int speed;

    // Constructor to initialize common attributes
    public AdvancedVehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Getters and Setters (Encapsulation)
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative");
        }
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void makeSound();

    // Concrete method (can be used by all subclasses)
    public void start() {
        System.out.println("The vehicle " + brand + " is started");
    }
}

// Subclass Car extends the abstract class
class Car extends AdvancedVehicle {
    private String color;

    public Car(String brand, int speed, String color) {
        super(brand, speed); // Call the parent class constructor
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("The car goes: Beep beep!");
    }

    // Specific method for Car
    public void accelerate() {
        setSpeed(getSpeed() + 10); // Increase speed
        System.out.println("Car accelerating. Current speed: " + getSpeed() + " km/h");
    }
}

// Subclass Motorcycle extends the abstract class
class Motorcycle extends AdvancedVehicle {

    public Motorcycle(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void makeSound() {
        System.out.println("The motorcycle goes: Vroom vroom!");
    }

    // Main method to test the code
    public static void main(String[] args) {
        // Creating objects
        AdvancedVehicle car = new Car("Toyota", 0, "Red");
        AdvancedVehicle motorcycle = new Motorcycle("Yamaha", 20);

        // Polymorphism: same method behaves differently depending on the object
        car.start();
        car.makeSound();
        ((Car) car).accelerate(); // Casting to call Car-specific method

        motorcycle.start();
        motorcycle.makeSound();
    }
}
