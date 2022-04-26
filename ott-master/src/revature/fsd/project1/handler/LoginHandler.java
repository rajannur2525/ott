package revature.fsd.project1.handler;

import revature.fsd.project1.app.App;
import revature.fsd.project1.dao.AdminLoginDao;
import revature.fsd.project1.dao.UserLogInDao;
import revature.fsd.project1.dao.getUserIdDao;


public class LoginHandler {
	public static int userid;
	public static void logindisplay() {
		System.out.println("Login Menu");
		System.out.println("=============");
		System.out.println("1. Admin Log In");
		System.out.println("2. User Log In");
		System.out.println("3. SignUp");
		System.out.println("Enter option: ");
		int option = App.scanner.nextInt();
		if (option == 1) {
			AdminLoginDao.adminlogin();
		}
		else if(option==2) {
			UserLogInDao.login();
			
		}
		else if(option==3) {
			SignUpHandler.SignUp();
			
		}
		else {
			System.out.println("Enter The Correct Option");
		}
		
	}

}
