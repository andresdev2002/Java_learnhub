package org.example;

public class CompresionZip implements EstrategiaCompresion {
    @Override
    public void comprimir(String archivo){
        System.out.println("Comprimiendo el archivo " + archivo);
    }
}