package jbbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Task23_Q2 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306";
		String Uname = "root";
		String pass = "as26";
		
		try {
			Connection connect = DriverManager.getConnection(url,Uname,pass);
			
			if(connect!=null) {
				System.out.println("Connection Established");
			}else {
				System.out.println("Connection Failed");
			}
			
			
			
			Statement smt = connect.createStatement();
			String CreateDB = "create database Task";
			smt.execute(CreateDB);
			System.out.println("DB Created");
			
			smt.execute("Use Task");
			
			smt.execute("Create Table employees(empcode int,empname varchar(10),empage int,esalary int)");
			System.out.println("Table Created");
			
			smt.executeUpdate("Insert into employees(empcode,empname,empage,esalary) values"+
			"('101','Jenny','25','10000'),"
			+ "('102','Jacky','30','20000'),"
			+ "('103','Joe','20','40000'),"
			+ "('104','John','40','80000'),"
			+ "('105','Shameer','25','90000')");
			System.out.println("Data Inserted");
			
			ResultSet res = smt.executeQuery("Select * from employees");
			
			while(res.next()) {
				System.out.println(res.getInt("empcode")+" "+
			res.getString("empname")+" "+
			res.getInt("empage")+" "+
			res.getString("esalary"));
				System.out.println();
				
			}
			connect.close();
			
		}catch(Exception e) {
			e.printStackTrace();

		}
	}

}
