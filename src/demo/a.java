package demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class a {
	public static Connection con;
	 public static void main(String[] args) {
	  String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	  String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=学员管理1";
	  String userName="sa";
	  String userPwd="sw123";
	 try
	{
		Class.forName(driverName);
	
		con=DriverManager.getConnection(dbURL,userName,userPwd);
		System.out.println("连接数据库成功！");
		con.close();
	}catch(Exception e){
		e.printStackTrace();
		System.out.println("加载驱动失败！");
	}
}
}
