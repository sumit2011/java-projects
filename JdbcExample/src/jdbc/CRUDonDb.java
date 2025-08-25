package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class CRUDonDb {
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@10.33.61.109:1521:xe";
		Connection conn = DriverManager.getConnection(url,"test","test123");
		System.out.println("connected");
		
		// update
		String editQry = "update student set stdname = ?, sub1=? where regno=?";
		PreparedStatement pst = conn.prepareStatement(editQry);
		pst.setNString(1, "jdbc");
		pst.setInt(2, 99);
		pst.setInt(3, 101);
		
		int rows = pst.executeUpdate();
		if(rows > 0) {
			System.out.println("updated " + rows);
		}else {
			System.out.println("not-updated "+rows);
		}
		
		// delete
		String dltQry = "delete from student where regno=?";
		pst = conn.prepareStatement(dltQry);
		pst.setInt(1, 101);
		
		rows = pst.executeUpdate();
		if(rows > 0) {
			System.out.println("deleted " + rows);
		}else {
			System.out.println("not-deleted "+rows);
		}
		
		//read
		String readQry = "select * from student";
		pst = conn.prepareStatement(readQry);
		ResultSet rs = pst.executeQuery();
		
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(rsmd.getColumnName(1)+ " " + rsmd.getColumnName(2) 
		+ " "+ rsmd.getColumnName(3)+ " "+rsmd.getColumnName(4));
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ " " + rs.getString("stdname") 
								+ " "+ rs.getInt(3)+ " "+rs.getDate(4));
		}
	}
	
}
