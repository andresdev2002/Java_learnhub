package org.example;

public class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //Method to display student info
    public void showInfo(){
        System.out.println("Student name: " + name );
        System.out.println("Student age: " + age );
        System.out.println("Student grade: " + grade );
    }
     // Method to check if the student passed
    public void checkPass(){
        if(grade >= 3.0){
            System.out.println(name + " Passed the course.");
        }else {
            System.out.println(name + "Dit not pass the course");
        }
    }

    public static void main(String[] args){
        //Creating student object
        Student student1 = new Student("Andres Calderon", 22, 3.8);
        student1.showInfo();
        student1.checkPass();
    }
}



