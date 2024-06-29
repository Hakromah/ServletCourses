import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {

	private String uname;
	private String email;
	private String upassword;
	private String ucity;
	private Connection connect = null;
	private PreparedStatement pstmt;
	private int row;

	public Model() {
		super();
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUcity() {
		return ucity;
	}

	public void setUcity(String ucity) {
		this.ucity = ucity;
	}

	// Let get the connection from JdbcUtil class
	// and we arrange the PrepareStatement
	public int register() {

		try {

			connect = JdbcUtil.getDBConnection();
			String sql = "INSERT INTO personalprofile(uname, email, upassword, ucity) VALUES(?,?,?,?)";
			pstmt = connect.prepareStatement(sql);

			pstmt.setString(1, uname);
			pstmt.setString(2, email);
			pstmt.setString(3, upassword);
			pstmt.setString(4, ucity);

			row = pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JdbcUtil.closeResource(connect, pstmt);
		}

		return row;
	}

}
