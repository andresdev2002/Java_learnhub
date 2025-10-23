package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        try{
            System.out.println("Escribe las notas para calcular el promedio");
            System.out.println("Primera calificación: ");
            int nota1 = scanner.nextInt();
            System.out.println("Segunda calificación: ");
            int nota2 = scanner.nextInt();
            System.out.println("Tercera calificación: ");
            int nota3 = scanner.nextInt();

            int promedio = (nota1 + nota2 + nota3) / 3;

            if (promedio >= 30 && promedio <= 50){
                System.out.println("¡Felicitaciones! aprobaste la materia");
            } else if (promedio > 50) {
                System.out.println("Error: los datos son incorrectos");
            }else {
                System.out.println("Reprobaste la materia");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: los datos son incorrectos");
        }
       scanner.close();
    }
}