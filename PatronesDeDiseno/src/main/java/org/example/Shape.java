//Factory Method
package org.example;

interface Shape {
    void Draw();
}
class Circle implements Shape{
    public void Draw(){
    System.out.println("Drawing a circle");
    }
}

class Square implements Shape{
    public void Draw(){
        System.out.println("Drawing a square");
    }
}

class ShapeFactory{
    public Shape getShape(String type){
        if(type.equalsIgnoreCase("Circle")){
            return new Circle();
        } else if (type.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }

    public static void main(String[] args){
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("Circle");
        shape1.Draw();

        Shape shape2 = factory.getShape("Square");
        shape2.Draw();


    }

}