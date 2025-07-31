package org.example;
//Create a base class Animal with a method makeSound().
// Create subclasses Dog and Cat that override this method.
public class Animals {
    public void makeSound(){
        System.out.println("Animal sound");
    }
    public static void main(String[] args){
        Animals dog1 = new dog();
        Animals cat1 = new cat();
        dog1.makeSound();
        cat1.makeSound();
    }
}

class dog extends Animals{
    @Override
    public void makeSound(){
        System.out.println("The dog woof: WOOF");
    }
}

class cat extends Animals{
    @Override
    public void makeSound(){
        System.out.println("The cat meaw: MEAW");
    }
}
