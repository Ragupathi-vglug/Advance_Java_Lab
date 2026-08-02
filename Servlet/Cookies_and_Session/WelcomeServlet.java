import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/WelcomeServlet")

public class WelcomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);
        String username = null;

        if (session != null) {
            username = (String) session.getAttribute("username");
        }

        if (username == null) {
            Cookie[] cookies = request.getCookies();

            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("username")) {
                        username = cookie.getValue();
                        break;
                    }
                }
            }
        }

        if (username != null) {
            out.println("<h2>Welcome, " + username + "!</h2>");
        } else {
            out.println("<h2>No user found. Please log in.</h2>");
            out.println("<a href='index.html'>Login</a>");
        }
    }
} {
    
}
