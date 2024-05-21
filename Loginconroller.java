import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet
{
private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException
{
String un=request.getParameter("username");
String pw=request.getParameter("password");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection c =
DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "rudhra", "rudhra");
PreparedStatement ps = c.prepareStatement("select * from login where
email=? and pass=?");
ps.setString(1, un);
ps.setString(2, pw);
ResultSet rs = ps.executeQuery();
while (rs.next())
{
response.sendRedirect("BMI.html");
return;
}
response.sendRedirect("error.html");
return;
}
catch (ClassNotFoundException | SQLException e)
{
e.printStackTrace();
}
}
}
