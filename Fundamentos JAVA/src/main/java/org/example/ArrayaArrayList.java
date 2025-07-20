//Filtra los números pares de un arreglo numeros y guardalos en una lista (ArrayList).*`
// Luego imprime esa lista con los números pares del arreglo numeros*`
package org.example;
import java.util.ArrayList;

public class ArrayaArrayList {
    public static void main(String[] args){
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> pares = new ArrayList<>();
        for (int num : numeros){
            if (num % 2 == 0) pares.add(num);
        }
        System.out.println("Los números pares del arreglo numero son: " + pares);
    }
}
