
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Control in Second Servlet #2");

		// get the forwarded data from the session
		HttpSession session = request.getSession(false); // we set it to false to prevent it from creating a new
															// session.
		String name = (String) session.getAttribute("name");
		String city = (String) session.getAttribute("city");

		PrintWriter writer = response.getWriter();
		writer.println("<h1>Response Fron Servlet #2</h1> \n");
		writer.println("<h1> Name: " + name + " City: " + city + " </h1>");
		writer.close();

	}

}
