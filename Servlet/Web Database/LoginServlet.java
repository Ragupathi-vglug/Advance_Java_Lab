import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {

            Connection con = DatabaseConnection.initializeDatabase();

            String sql = "SELECT * FROM stud WHERE user=? AND pass=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                out.println("<html>");
                out.println("<body>");
                out.println("<h2>Login Successful</h2>");
                out.println("<h3>Welcome " + username + "</h3>");
                out.println("</body>");
                out.println("</html>");

            } else {

                out.println("<html>");
                out.println("<body>");
                out.println("<h2>Invalid Username or Password</h2>");
                out.println("</body>");
                out.println("</html>");

            }

            con.close();

        } catch (Exception e) {

            out.println("<h2>Database Error</h2>");
            e.printStackTrace(out);

        }

    }

}