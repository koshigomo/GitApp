import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 自分の名前を表示するサーブレット
 */
public class GitInputServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // レスポンスヘッダーの設定
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        // 自分の名前
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");



        // レスポンスのメッセージボディにHTMLを出力
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>My Name</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>My name is " + name + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}