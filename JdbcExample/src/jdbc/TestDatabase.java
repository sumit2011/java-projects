package jdbc;
import java.sql.*;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class TestDatabase {

	public static void main(String[] args) throws SQLException{
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@10.33.61.109:1521:xe";
		Connection conn = DriverManager.getConnection(url,"test","test123");
		System.out.println("connected");
//		String qry = "insert into student values(?,?,?,?)";
//		PreparedStatement pst = conn.prepareStatement(qry);
//		pst.setInt(1, 101);
//		pst.setString(2, "sutherland");
//		pst.setInt(3, 101);
//		pst.setString(4, "10-oct-03");

		
		Scanner sc = new Scanner(System.in);
		System.out.print("RegNo: ");
		int regNo = sc.nextInt();
		sc.nextLine();
		System.out.print("Student Name: ");
		String stdName = sc.nextLine();
		
		String qry = "insert into student(regno,stdname) values(?,?)";
		PreparedStatement pst = conn.prepareStatement(qry);
		pst.setInt(1, regNo);
		pst.setString(2, stdName);
		
		int rows = pst.executeUpdate();
		System.out.println("inserted"+rows);
		conn.close();
	}
}
