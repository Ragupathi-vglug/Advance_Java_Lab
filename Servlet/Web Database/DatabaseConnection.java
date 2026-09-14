import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    static Connection con;

    public static Connection initializeDatabase() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ragu",
                    "root",
                    "ragu@123");     // Change to your MySQL password

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

}