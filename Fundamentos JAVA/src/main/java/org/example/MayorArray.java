// Buscar el número mayor en un array
package org.example;

public class MayorArray {
    public static void main(String[] args){

        int[] mayor = {1,2,3,4,8,10,23};
        int max = mayor[0];

        for (int num : mayor){
            if (num > max) max = num;
        }
        System.out.println("El valor maximo es:" + max);
    }
}
//La variable max es donde se va guardando el número mayor cada vez que num es mayor que el valor actual de max.