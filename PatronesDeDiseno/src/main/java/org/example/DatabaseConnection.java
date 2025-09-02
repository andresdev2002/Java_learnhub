package org.example;
//Singleton Class
public class DatabaseConnection {
    //Crear una única instancia estática
    private static DatabaseConnection instance;
    //Constructor privado (para que no se pueda instanciar con "new")
    private DatabaseConnection(){
        System.out.println("Database connection established!");
    }
    //Método público para obtener la única instancia
    public static DatabaseConnection getInstance(){
        if (instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
    // Ejemplo de método dentro de la clase
    public void query(String sql){
        System.out.println("Executing query:" + sql);
    }
    // Clase de prueba
    public static void main(String[] args){
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        DatabaseConnection conn2 = DatabaseConnection.getInstance();

        conn1.query("SELECT + FROM users");
    // Verificamos que es la misma instancia
        System.out.println(conn1 == conn2);
    }
}