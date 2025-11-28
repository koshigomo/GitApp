import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GitInputServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException{
            request.setCharacterEncoding("UTF-8");


            String last = request.getParameter("lastName");
            String first = request.getParameter("firstName");

            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>My name</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>姓"+first+"</h1>");
            out.println("<h1>名:"+last+"</h1>");
            out.println("</body>");
            out.println("</html>");

        }
}