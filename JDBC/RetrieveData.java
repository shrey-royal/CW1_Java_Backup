import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();

            //create statement
            Statement stmt = conn.createStatement();

            //execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM `users`");


            if(rs != null) {
                System.out.println("id\tusername\tpassword\temail");
                System.out.println("--------------------------------------------------");
                while(rs.next()) {
                    System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t\t" + rs.getString("password") + "\t" + rs.getString(4));
                }
            } else {
                System.out.println("No data found");
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
