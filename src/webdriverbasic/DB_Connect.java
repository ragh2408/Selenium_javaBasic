package webdriverbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Connect {

	public static void main(String[] args) throws SQLException {
		String str2="jdbc:mysql://localhost:3306/newdatabase";
		           Connection connobj= DriverManager.getConnection(str2,"root","");
		           
		          Statement st= connobj.createStatement();
		         ResultSet rs= st.executeQuery("select * from ram");
		          
		        int fieldcnt= rs.getMetaData().getColumnCount();
		        System.out.println(fieldcnt);
		       // rs.next();
		       // rs.last();
		       
		    // int rnum=   rs.getRow();
		     //System.out.println(rnum);
		    // rs.first();
		     // for (int i=1;i<=rnum;i++){
		    	while (rs.next()){  
		    for (int j=1 ;j<=fieldcnt;j++){
		    	String str=rs.getString(j);
		    	System.out.println(str);
		    }
		   // rs.next();	  
		      }
		        
		        
		          

	}
	
	public static Connection connection(String connstring,String uname,String pwd) throws SQLException{
		 Connection connobj= DriverManager.getConnection(connstring,uname,pwd);
		 return connobj;
	}
	
	

}
