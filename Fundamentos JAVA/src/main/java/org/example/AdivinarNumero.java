package org.example;
import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args){
        Random rand = new Random();
        int secreto = rand.nextInt(100)+1;

        Scanner scanner = new Scanner(System.in);
        int intento;

        do {
            System.out.println("Adivina el número: ");
            intento = scanner.nextInt();

            if (intento > secreto){
                System.out.println("¡Muy alto! Sigue intentando");
            }else if (intento < secreto){
                System.out.println("¡Muy bajo! Sigue intentando");
            }else{
                System.out.println("¡Correcto! Adivinaste el número secreto");
            }

        }while (intento != secreto);

        scanner.close();

    }
}
