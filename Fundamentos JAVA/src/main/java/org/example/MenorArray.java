package org.example;

public class MenorArray {
    public static void main(String[] args){
        int[] menor = {2,6,4,7,1,9,10};
        int min = menor[0];

        for (int num : menor){
            if (num < min) min = num;
        }
        System.out.println("El número menor es: " + min);
    }
}
