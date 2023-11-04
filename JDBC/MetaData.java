import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class MetaData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();

            DatabaseMetaData dbmd = conn.getMetaData();

            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());
            System.out.println("DataBase Name: " + dbmd.getDatabaseProductName());
            System.out.println("DataBase Version: " + dbmd.getDatabaseProductVersion());
            
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
