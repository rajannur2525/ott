package revature.fsd.project1.handler;

import java.util.List;

import revature.fsd.project1.app.App;
import revature.fsd.project1.dao.SignUpDao;
import revature.fsd.project1.model.SignUp;

public class SignUpHandler {
	public static void SignUp() {
		 System.out.println("Enter the user name : ");  
		  String str1 = App.scanner.next(); 
		  System.out.println("Enter the Mobile NUmber : ");  
		  String str2 = App.scanner.next(); 
		  System.out.println("Enter the password : ");  
		  String str3 = App.scanner.next();
		  SignUpDao sign=new SignUpDao();
		  List<SignUp> su=sign.Signup(str1, str2, str3);
		  
		  System.out.println("SignUp Successfully Plz Login ");
		  MainMenuHandler.display();
	}

}
