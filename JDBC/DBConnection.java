import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            //load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create the connection
            final String URL = "jdbc:mysql://localhost:3306/cw1_amd";
            final String USERNAME = "root";
            final String PASSWORD = "root";

            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            if(conn != null) {
                System.out.println("Connected to the database");
            } else {
                System.out.println("Failed to connect to the database");
            }

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return conn;
    }

    public static void main(String[] args) {
        getConnection();
    }
}

/*
JDBC: java database connectivity

steps to connect and use the database:

1. Load the driver class: mysql-conector-java-8.0.25.jar
 > this converts java code to sql code and vice versa

2. Create connection: Connection
 > this is used to connect to the database

3. Create statement: Statement
 > this is used to execute queries

4. Execute queries: ResultSet
 > this is used to store the result of the query

5. Close the connection
 > this is used to close the connection

*/