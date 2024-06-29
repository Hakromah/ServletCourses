
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Control in Serlet");

		String uname = request.getParameter("uname");
		String emailId = request.getParameter("email");
		String upassword = request.getParameter("password");
		String ucity = request.getParameter("ucity");

		// Store the data to DB
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/servlet_db";
			String user = "root";
			String password = "M.root1847";
			Connection connect = DriverManager.getConnection(url, user, password); 

			PreparedStatement pstm = connect 
					.prepareStatement("INSERT INTO personalprofile (uname, email, upassword, ucity) VALUES(?,?,?,?)");

			pstm.setString(1, uname);
			pstm.setString(2, emailId);
			pstm.setString(3, upassword);
			pstm.setString(4, ucity);

			int rowsAffected = pstm.executeUpdate();
			PrintWriter writer = response.getWriter();

			if (rowsAffected != 0) {

				writer.println("<h2>Registration Successs</h2>");

			} else {

				writer.println("<h2>Registration Failed!</h2>");
			}

			pstm.close();
			connect.close();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
