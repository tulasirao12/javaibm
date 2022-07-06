import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {
		
		String sql1 = "insert into person values('Drek',43,'Delhi')";
		String sql2 = "update person set age=29 where name='polo'";
		String sql3 = "delete from person where name='ram'";
		Connection con=null;
		
		try {
			con = JdbcFactory.getConnection();
			con.setAutoCommit(false);
			
			
			Statement stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			stmt.executeBatch();
			con.commit(); // commit only when all the statements executes successfully
			System.out.println("Transaction completed");
		}catch(SQLException se) {
			System.out.println("Transaction failed due to ...");
			se.printStackTrace();
			try {
				con.rollback();
			   } catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
