package org.example;

import java.util.Scanner;

public class ConvertidorTemperatura{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Esceriba el numero: ");
            double celsious = scanner.nextDouble();//Leer decimal

            Double fahrenheit = celsious * 9 / 5 + 32;

            System.out.print("La temperatura en fahrenheit es:" + fahrenheit  );

            scanner.close();
    }
}


//Formula F = C × 9/5 + 32