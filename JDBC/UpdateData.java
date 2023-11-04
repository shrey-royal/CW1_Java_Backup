import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();

            String query = "UPDATE users SET username=?, password=?, email=? WHERE id=?";

            PreparedStatement pstmt = conn.prepareStatement(query);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter id: ");
            pstmt.setInt(4, sc.nextInt());
            
            System.out.print("Enter username: ");
            pstmt.setString(1, sc.next());

            System.out.print("Enter password: ");
            pstmt.setString(2, sc.next());
            
            System.out.print("Enter email: ");
            pstmt.setString(3, sc.next());
            sc.close();

            int re = pstmt.executeUpdate();

            if(re > 0) {
                System.out.println("Data Updated Successfully!");
            } else {
                System.out.println("Faied to update Data!");
            }
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
