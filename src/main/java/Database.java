import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 
 */

/**
 * @author etd7
 *
 */
public class Database {

	/**
	 * @param args
	 */
	
	private Connection conn;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	/**
	 * {@summary Instantiate database connection}
	 * @param dbName
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws SQLException
	 */
	
	public void connect(String dbName) throws ClassNotFoundException, IOException, SQLException {
		SimpleDataSource.init(dbName);
		this.conn = SimpleDataSource.getConnection();
	}
	
	/**
	 * {@summary Close database connection}
	 * @throws SQLException
	 */
	
	public void close() throws SQLException {
		this.conn.close();
	}

}
