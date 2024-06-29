

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				String uname = request.getParameter("uname");
				String ucity = request.getParameter("ucity");
				
				System.out.println("Name: "+ uname+ " City: "+ucity);


				response.sendRedirect("/ServletRedirection/successful.jsp");

				
				
				
				
				
				
				
				
				
				

				// response back to client
				//PrintWriter writer = response.getWriter();	
				
//						writer.println("Hello " + uname);
//						writer.println("I know you're from " + ucity);
		//
//				writer.println("<html> <head> <title> Second App </title></head>");
//				writer.println("<body bgcolor='cyan'> <h1><marquee>Welcome to our Second Web Application</marquee></h1>");
//				writer.println("<table>");
//				writer.println("<tr> <th>NAME</th> <th>CITY</th> </tr>");
//				writer.println("<tr><td> " + uname + "</td> <td> " + ucity + " </td></tr>");
		//
//				writer.println("</table></body>");
//				writer.println("</html>");
//				writer.close();
	}

}
