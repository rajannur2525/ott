package revature.fsd.project1.handler;

import revature.fsd.project1.app.App;


public class UserMenuHandler {
	public static void menudisplay() {
		System.out.println("User Menu");
		System.out.println("==*===*==");
		System.out.println("1. View Top 5 Movies");
		System.out.println("2. Search Movies");
		System.out.println("3. Your Wish List");
		System.out.println("4. View History");
		System.out.println("5. Logout");
		System.out.println("Select an option: ");
		int option = App.scanner.nextInt();
		switch(option) {
		case 1:
			Top5MoviesHandler.display();	
			break;
		case 2:
			SearchMoviesHandler.Search();
			break;
		case 3:
			ViewWishListHandler.display();
			break;
		case 4:
			System.out.println("You select a Option 4");
			break;
		case 5:
			System.out.println("Logout Successfully..");
			MainMenuHandler.display();
			break;
		}
		
		
	}
	

}
