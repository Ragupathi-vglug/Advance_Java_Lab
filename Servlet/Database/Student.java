import java.sql.*;

public class Student {

    public static void main(String args[]) {

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database connection details
            String url = "jdbc:mysql://localhost:3306/ragu";
            String user = "root";
            String password = "ragu@123";

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Created DB Connection...");

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute Query
            ResultSet rs = stmt.executeQuery("SELECT Id, name, class FROM student");

            // Print Column Names
            ResultSetMetaData rsmd = rs.getMetaData();
            int count = rsmd.getColumnCount();

            for (int i = 1; i <= count; i++) {
                System.out.print(rsmd.getColumnName(i) + "\t");
            }
            System.out.println();

            // Print Records
            while (rs.next()) {
                System.out.print(rs.getInt("id") + "\t");
                System.out.print(rs.getString("name") + "\t");
                System.out.print(rs.getString("dept") + "\t");
                System.out.println();
            }

            // Close Resources
            rs.close();
            stmt.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver Not Found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database Connection Error!");
            e.printStackTrace();
        }
    }
}