// Suma de elementos de un array
package org.example;

public class SumaArray {
    public static void main(String[] args){
        int[] numeros = {1,2,3,4,5,6,7,8,9};
        int suma = 0;

        for (int num : numeros ){
            suma += num;
        }
        System.out.println("La suma e: " + suma);
    }
}
