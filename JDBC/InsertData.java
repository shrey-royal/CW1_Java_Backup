import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();

            //create the statement
            String insertQuery = "INSERT INTO `users` (`username`, `password`, `email`) VALUES (?, ?, ?)";        //? is a placeholder
            
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);

            //set the values
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter username: ");
            // sc.nextLine();
            pstmt.setString(1, sc.nextLine());

            System.out.println("Enter password: ");
            pstmt.setString(2, sc.nextLine());

            System.out.println("Enter email: ");
            pstmt.setString(3, sc.nextLine());

            //execute the query
            int re = pstmt.executeUpdate();

            if(re > 0) {
                System.out.println("Data inserted successfully");
            } else {
                System.out.println("Failed to insert data");
            }

            sc.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
