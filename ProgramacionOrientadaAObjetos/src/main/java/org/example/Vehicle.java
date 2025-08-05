//Create an abstract class Vehicle with a method move().
// Create Car and Bicycle classes that override move().
package org.example;

public abstract class Vehicle {
    public abstract void move();
}

class car extends Vehicle{
    @Override
    public void move(){
        System.out.println("The car moves using fuel");
    }
}

class bicycle extends Vehicle{
    @Override
    public void move(){
        System.out.println("The bicycle moves using pedals");
    }

    public static void main(String[] args){
        Vehicle car1 = new car();
        Vehicle bicycle1 = new bicycle();

        car1.move();
        bicycle1.move();
    }

}

