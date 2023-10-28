import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();

            //create statement
            String query = "DELETE FROM `users` WHERE `id` = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            //set data
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id: ");
            pstmt.setInt(1, sc.nextInt());
            sc.close();

            //execute query
            int re = pstmt.executeUpdate();

            if(re > 0) {
                System.out.println("Data deleted successfully");
            } else {
                System.out.println("Failed to delete data");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
