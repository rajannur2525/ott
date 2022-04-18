package revature.fsd.project1.handler;

import revature.fsd.project1.app.App;

public class AdminMenuHandler {
	public static void display() {
		System.out.println("Admin Menu");
		System.out.println("==========");
		System.out.println("1. Change Top-5 Movies");
		System.out.println("2. Mark movie unavailable");
		System.out.println("3. Modify movie details");
		System.out.println("4. Logout");
		System.out.println("Select an option: ");
		int option = App.scanner.nextInt();
		switch(option) {
		case 1:
			AdminTop5MoviesHandler.display();
			break;
		case 2:
			
			break;
		case 3:
			ModifyMovieDetailshandler.display();
			break;
		case 4:
			System.out.println("Loging Out....!");
			System.out.println("Logout successfull....");
			MainMenuHandler.display();
			break;
		}
		
	}

}
