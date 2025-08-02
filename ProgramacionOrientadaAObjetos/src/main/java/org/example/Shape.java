package org.example;

class Main {
    public static void main(String[] args) {
        Shape square = new Square(4);
        Shape circle = new Circle(3);

        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Circle area: " + circle.calculateArea());
    }
}

// Clase abstracta Shape
abstract class Shape {
    public abstract double calculateArea();
}

// Clase Square que extiende Shape
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Clase Circle que extiende Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

