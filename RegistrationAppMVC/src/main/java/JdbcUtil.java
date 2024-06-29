
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {

	// will write all the database connection codes here in this utility class
	static {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		System.out.println("Driver is Registered");
	}

	public static Connection getDBConnection() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/servlet_db";
		String userName = "root";
		String password = "M.root1847";

		return DriverManager.getConnection(url, userName, password);

	}

	public static void closeResource(Connection connect, Statement statement) {
		if (connect != null && statement != null)
			try {
				connect.close();
				statement.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
	}

}
