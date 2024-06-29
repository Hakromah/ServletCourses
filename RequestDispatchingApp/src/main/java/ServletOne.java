
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// I want Servlet #1 to receive the requests from the Client and forward it to
		// Servlet #2
		// and then Servlet #2 will send the response directly to the Client.

		System.out.println("Control in Servlet # 1");

		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		RequestDispatcher dispatch = request.getRequestDispatcher("/ServletTwo");
		
		//to forward the data to another Servlet, we store the variables in session
		// that way you can get them anywhere from session.
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		session.setAttribute("city", city);
		
		session.setMaxInactiveInterval(6000);// when you login data in the session will get expire after setTimeout

		dispatch.forward(request, response);
		//dispatch.include(request, response);

		PrintWriter writer = response.getWriter();
		writer.println("<h1>Response From Servlet #1</h1>");
		writer.close();
	}

}
