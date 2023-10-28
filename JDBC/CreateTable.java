import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();

            //create the statement
            Statement stmt = conn.createStatement();

            //execute the query
            String query = "CREATE TABLE IF NOT EXISTS `users` ("
                + "`id` INT NOT NULL AUTO_INCREMENT,"
                + "`username` VARCHAR(45) NOT NULL,"
                + "`password` VARCHAR(45) NOT NULL,"
                + "`email` VARCHAR(45) NOT NULL,"
                + "PRIMARY KEY (`id`))";

            int re = stmt.executeUpdate(query);

            System.out.println("re: " + re);

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}
