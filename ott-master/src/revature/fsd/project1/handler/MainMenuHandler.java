package revature.fsd.project1.handler;

import revature.fsd.project1.app.App;

public class MainMenuHandler {
	public static void display() {
		System.out.println("App Main Menu");
		System.out.println("=============");
		System.out.println("1. Sign Up");
		System.out.println("2. Log In");
		System.out.println("3. Exit");
		System.out.println("Enter option: ");
		int option = App.scanner.nextInt();
		if (option == 1) {
			SignUpHandler.SignUp();
		}
		else if(option==2) {
			LoginHandler.logindisplay();
			
		}
		else if(option==3) {
			System.out.println("Exit Successfully");
		}
		else {
			System.out.println("Enter The Correct Option");
		}
	}


}
