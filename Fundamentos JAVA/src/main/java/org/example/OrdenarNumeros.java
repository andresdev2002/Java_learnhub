package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarNumeros{
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        Collections.sort(numeros, Collections.reverseOrder());//Permite organizar números de menor a mayor.
        System.out.println("El orden de los números es:" + numeros);
    }

}
