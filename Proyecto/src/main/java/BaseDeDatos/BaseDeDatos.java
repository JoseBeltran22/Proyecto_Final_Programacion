package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDeDatos {
    
    private static String url = "jdbc:postgresql://postgresumg22.postgres.database.azure.com:5432/proyecto_final";
    private static String user = "adminpostgres";
    private static String password = "Azhaniel22";
    
    public static Connection getConection(){
        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión Exitosa");
            return connection;
        }
        catch (SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
}
