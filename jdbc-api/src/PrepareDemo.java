import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareDemo {

	public static void main(String[] args) {
		
		String sql = "insert into person values (?,?,?)";
		try {
		Connection conn = JdbcFactory.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, args[0]);
		ps.setInt(2, Integer.parseInt(args[1]));
		ps.setString(3, args[2]);
		ps.executeUpdate();
		System.out.println("Record inserted");
		}catch(SQLException se) {
			se.printStackTrace();
		}
		
	}

}