//Este programa cuenta cuántas veces aparece un número específico en una lista.
package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ContarOcurrencias {
    public static void main(String[] args){

        ArrayList<Integer> lista = new ArrayList<>(List.of(1,2,3,3,2,2,2,2,2,5,6,7));
        int objetivo = 2;
        int contador = 0;

        for (int num : lista){
            if (num == objetivo) contador++;
        }
        System.out.println("El numero 2 se repite " + contador + " veces");
    }
}
