package org.example;
import java.util.Arrays;

public class invertirPalabras {
    public static void main(String[] args){
        String[] palabras = {"uno", "dos", "tres", "cuatro", "cinco"};
        for (int i = 0; i < palabras.length / 2; i++ ){
            String inve = palabras[0];
            palabras[i] = palabras[palabras.length -1 -i];
            palabras[palabras.length -1 -i] = palabras[i];
        }
        System.out.println(Arrays.toString(palabras));
    }
}
