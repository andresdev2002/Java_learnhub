package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main(String[] args){
    //Archivos individuales
    Componente archivo1 = new Archivo("foto.jpg");
    Componente archivo2 = new Archivo("documento.pdf");
    Componente archivo3 = new Archivo("musica.mp3");

    //Carpeta con archivos
    Carpeta carpeta1 = new Carpeta("Mis documentos");
    carpeta1.agregar(archivo1);
    carpeta1.agregar(archivo2);

    //Carpeta con otra carpeta dentro

    Carpeta carpeta2 = new Carpeta("Multimedia");
    carpeta2.agregar(archivo1);
    carpeta2.agregar(archivo3);

    carpeta2.mostrar();


}
}