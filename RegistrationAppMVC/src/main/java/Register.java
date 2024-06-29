
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		String upassword = request.getParameter("upassword");
		String ucity = request.getParameter("ucity");

		Model model = new Model();

		model.setUname(uname);
		model.setEmail(email);
		model.setUpassword(upassword);
		model.setUcity(ucity);

		int rowAffected = model.register();

		// add the data to the session so I can be able to collect it in any other class
		// and do anything with it I want
		HttpSession session = request.getSession();
		session.setAttribute("name", uname);
		session.setAttribute("email", email);
		session.setAttribute("password", upassword);
		session.setAttribute("city", ucity);

		if (rowAffected != 0) {

			response.sendRedirect("/RegistrationAppMVC/Success.jsp");

		} else {
			response.sendRedirect("/RegistrationAppMVC/Failure.jsp");
		}

	}

}
