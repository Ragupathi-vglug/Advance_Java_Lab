import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/vote")
public class vote extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");

        if (age < 18) {

            out.println("<h2>" + name + " is not eligible to vote.</h2>");

        } else {

            out.println("<h2>" + name + " is eligible to vote.</h2>");

        }

        out.println("</body></html>");

        out.close();
    }
}