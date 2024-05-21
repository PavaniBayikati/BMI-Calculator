import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet
{
 private static final long serialVersionUID = 1L;
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException
 {
 String un = request.getParameter("username");
 String pw = request.getParameter("password");
 try
 {
 Class.forName("com.mysql.jdbc.Driver");
 Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "rudhra",
"rudhra");
 PreparedStatement ps = c.prepareStatement("INSERT INTO login (email, pass) VALUES (?,
?)");
 ps.setString(1, un);
 ps.setString(2, pw);
 int rowsAffected = ps.executeUpdate();
 if (rowsAffected > 0)
 {
 String message = "Your Registration is successful!";
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 out.println("<script type=\"text/javascript\">");
 out.println("alert('" + message + "');");
 out.println("window.location.href='index.html';");
 out.println("</script>");
 }
 else
 {
 response.sendRedirect("error.html");
 }
 c.close();
 }
 catch (ClassNotFoundException | SQLException e)
 {
 e.printStackTrace();
 }
 }
}
