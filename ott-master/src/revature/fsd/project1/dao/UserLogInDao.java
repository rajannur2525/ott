package revature.fsd.project1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import revature.fsd.project1.app.App;
import revature.fsd.project1.handler.UserMenuHandler;

public class UserLogInDao {
	public static int id;
	public static void login() {
	  
	  System.out.println("Enter the user name : ");  
	  String str1 = App.scanner.next();  
	  System.out.println("Enter the password : ");  
	  String str2 = App.scanner.next();
	  String sql = String.format("select * from user where name='" + str1 + "' and password='" + str2 + "'");
	try (
			Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
		) {
			ResultSet rs = stmt.executeQuery();
			if (rs.next())  {
		        id=getUserIdDao.id(str1, str2);
				   System.out.println("Welcome::: " + str1);  
			        UserMenuHandler.menudisplay();

			        
			}
				  else  
				   System.out.println("Invalid user name and password Retry");
					UserLogInDao.login();
			
			
		} catch (SQLException e) {
			Util.displayMessage(e);
		}
		
}

}
