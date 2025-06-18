package org.example;

public class Division {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Genera una excepción
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero!");
        }
    }
}
//try-catch nos permite hacer excepciones,como en este caso que 10 no se pude dividir en cero
