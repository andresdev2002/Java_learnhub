package org.example;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark(){
        System.out.println(name + " is barking");
    }
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void showInfo(){
        System.out.println("Name: " + name + " Breed:" + breed + " Age:" + age + "years");
    }

    public static void main(String[] args){
        Dog dog1 = new Dog("Tin-tin", "Labrador", 2);
        dog1.showInfo();
        dog1.bark();
        dog1.eat();
    }
}
