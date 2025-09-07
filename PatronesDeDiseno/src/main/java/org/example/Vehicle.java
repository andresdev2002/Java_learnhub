// Factory Method Exercise
// Create a VehicleFactory that returns:
// Car if you pass "CAR".
// Bike if you pass "BIKE".
// Each class must have a drive() method.
// Test it in main.
package org.example;
// Interface Vehicle
 interface  Vehicle {
    void drive();
 }

// Car class implementing Vehicle
 class Car implements Vehicle{
     public void drive() {
        System.out.println("The car accelerating");
     }
 }
// Bike class implementing Vehicle
 class Bike implements Vehicle{
     public void drive(){
         System.out.println("The bike is pedaling");
     }
 }
// Vehicle Factory
 class VehicleFactory{
    public Vehicle getVehicle(String type){
        if (type.equalsIgnoreCase("CAR")){
            return new Car();
        } else if (type.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
            return null;
    }

    public static void main(String[] args){
        VehicleFactory factory = new VehicleFactory();
        // Create a Car
        Vehicle vehicle1 = factory.getVehicle("CAR");
        vehicle1.drive();
        // Create a Bike
        Vehicle vehicle2 = factory.getVehicle("BIKE");
        vehicle2.drive();
    }

 }