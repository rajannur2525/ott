package revature.fsd.project1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import revature.fsd.project1.app.App;
import revature.fsd.project1.handler.AdminMenuHandler;


public class AdminLoginDao {
	public static void adminlogin() {
		  
		  System.out.println("Enter the user name : ");  
		  String str1 = App.scanner.next();  
		  System.out.println("Enter the password : ");  
		  String str2 = App.scanner.next();
		  String sql = String.format("select * from admin where name='" + str1 + "' and password='" + str2 + "'");
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
				ResultSet rs = stmt.executeQuery();
				if (rs.next())  {
					   System.out.println("Welcome : " + str1);  
				       AdminMenuHandler.display();
				}
					  else  
					   System.out.println("Invalid user name and password Retry");
						AdminLoginDao.adminlogin();
						
				
				
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
			
	}

}
