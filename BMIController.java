import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/BMICalculationController")
public class BMICalculationController extends HttpServlet
{
 private static final long serialVersionUID = 1L;
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException
 {
 double height_cm = Double.parseDouble(request.getParameter("height_cm"));
 double weight_kg = Double.parseDouble(request.getParameter("weight_kg"));
 double bmi = weight_kg / ((height_cm / 100) * (height_cm / 100));
 response.sendRedirect("Result.jsp?bmi=" + bmi);
 }
}
