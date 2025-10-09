package org.example;

public class Compresion7z implements EstrategiaCompresion {
    @Override

    public void comprimir(String formato){
        System.out.println("Comprimiendo el archivo " + formato);
    }
}
