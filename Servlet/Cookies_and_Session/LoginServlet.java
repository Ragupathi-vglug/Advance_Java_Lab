import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String username = request.getParameter("username");

        // Create Session
        HttpSession session = request.getSession();
        session.setAttribute("username", username);

        // Create Cookie
        Cookie userCookie = new Cookie("username", username);
        userCookie.setMaxAge(60 * 60 * 24); // 1 day
        response.addCookie(userCookie);

        response.sendRedirect("WelcomeServlet");
    }
}