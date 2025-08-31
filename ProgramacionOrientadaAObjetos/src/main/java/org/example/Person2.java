// Create a Person class with attributes name and age. Then create an object and display its data.
package org.example;
public class Person2 {
    String name;
    int age;

    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void ShowData(){
        System.out.println("My name is: " + name + " My age is: " + age);
    }

    public static void main(String [] args){
        Person2 person = new Person2("Andres Calderon", 22);
        person.ShowData();
    }
}
