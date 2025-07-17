//Invertir un arreglo de caracteres
package org.example;

import java.util.Arrays;

public class InvertirCaractere {
    public static void main(String[] args) {

        char[] letras = {'A', 'B', 'C', 'D', 'E'};
            for (char i = 0; i < letras.length / 2; i++){
                char temp = letras[i];
                letras[i] = letras[letras.length -1 -i];
                letras[letras.length -1 -i] = temp;

            }
                System.out.println(Arrays.toString(letras));

    }
}
