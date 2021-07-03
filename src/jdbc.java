/**
 * 
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Dabeer.Haider
 * Download and configure ODBC jar file
 * Create Connection using Connection and Driver Manager class
 * create statement using Connec.createstatement()
 * execute statement 
 * 
 *
 */
public class jdbc 
{

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@DISTPS-scan.corp.ads:41521/DISTPSsva.WORLD","SCOTT_APP","vappscott");
		
		Statement st= con.createStatement();
		
		String query="select * from extnd_wrnty_contract where COVERED_DEVICE_SERIAL_NUM = '521113481862480'";
		ResultSet rs= st.executeQuery(query);
		int i=1;
		while(i>0 & rs.next())
		{
			
		System.out.println(rs.getObject(i));
		i++;
		}
		con.close();
		// TODO Auto-generated method stub

	}

}
