//Class ans object structure
package org.example;
public class CarClassObjets {
//Attributes and properties
    String brand;
    String color;
    int speed;

    //Constructor
    public CarClassObjets(String brand, String color, int speed ){
        this.brand = brand;
        this.color = color;
        this.speed = speed;

    }
    //Method(Behavior)
    void accelerate(){
        speed += 10;
        System.out.println("The car " + brand + " is accelerating. Current speed: " + speed + " km/h");
    }

    //Object Creation
        public static void main(String[] args){
            //Create an object of the car class
            CarClassObjets car1 = new CarClassObjets("Toyota", "Red", 50);
            car1.accelerate(); //Call the accelerate method

    }
}
