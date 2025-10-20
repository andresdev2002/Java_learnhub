package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe la altura del triangulo:");
        double altura = scanner.nextInt();

        System.out.println("Escribe la base del triangulo:");
        double base = scanner.nextInt();

        Double resultado = base * altura / 2;
         System.out.println("El área del triángulo es: " + resultado + " cm2");



    }
}