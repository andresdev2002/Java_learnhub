//Crea una clase llamada Logger que:

//Solo pueda tener una instancia.

//Tenga un metodo log(String message) que imprima en consola el mensaje con un prefijo [LOG]:.

//Prueba crear dos instancias y verifica que son el mismo objeto.
package org.example;

public class LoggerSingleton {
    private static LoggerSingleton instance;

    private LoggerSingleton(){
        System.out.println("Logger instance created");
    }
public static LoggerSingleton getInstance(){
        if (instance == null){
            instance = new LoggerSingleton();
        }
        return instance;
}
public void log(String message){
        System.out.println("[LOG]:" + message);
}

public static void main(String[] args){
        LoggerSingleton logger1 = LoggerSingleton.getInstance();
        LoggerSingleton logger2 = LoggerSingleton.getInstance();

        logger1.log("This is the first log message");
        logger2.log("This is the second log message");

    System.out.println("Are logger1 and logger2 the same instance? " + (logger1 == logger2));

}

}
