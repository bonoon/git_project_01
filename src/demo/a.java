package demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class a {
	public static Connection con;
	 public static void main(String[] args) {
	  String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	  String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=ѧԱ����1";
	  String userName="sa";
	  String userPwd="sw123";
	 try
	{
		Class.forName(driverName);
	
		con=DriverManager.getConnection(dbURL,userName,userPwd);
		System.out.println("�������ݿ�ɹ���");
		con.close();
	}catch(Exception e){
		e.printStackTrace();
		System.out.println("��������ʧ�ܣ�");
	}
}
}
