package org.example;

public interface Componente {
    void mostrar();
}

//Define la interfaz común que tanto Archivo como Carpeta deben implementar.
//
//El cliente trabajará siempre contra Componente, sin importar si es un archivo o carpeta.
//
//Método mostrar() es la acción estándar que todos deben tener.