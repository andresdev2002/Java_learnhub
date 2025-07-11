package org.example;
import javax.swing.*;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el primer número: ");
        double a = scanner.nextDouble();
        System.out.println("Escriba el segundo número: ");
        double b = scanner.nextDouble();
        System.out.println("Escriba el tipo de operación(/, *, +, -)");
        char op = scanner.next().charAt(0);

        switch(op){
            case '+':
                System.out.println("Resultado: " + (a+b));
                break;
            case '-':
                System.out.println("Resultado: " + (a-b));
                break;

            case '*':
                System.out.println("Resultado:" + (a*b));
                break;

            case '/':
                if (b != 0){
                    System.out.println("Resultado:" + (a/b) );

                }else {
                    System.out.println("Error: Division por cero");
                }
            break;
            default:
                System.out.println("Operación Inválida");
        }
        scanner.close();

    }
}
