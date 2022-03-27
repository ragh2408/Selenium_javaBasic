package webdriverbasic;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Write {

	public static void main(String[] args) throws SQLException {
		Connection    cnnobj=DB_Connect.connection("jdbc:mysql://localhost:3306/newdatabase", "root", "");
		Statement st=cnnobj.createStatement();
		st.executeUpdate("insert into ram values ('8','gghgj','hhgg')");
	}

}
