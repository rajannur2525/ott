package revature.fsd.project1.handler;

import java.util.List;

import revature.fsd.project1.app.App;
import revature.fsd.project1.dao.AddHistoryDao;
import revature.fsd.project1.dao.UserLogInDao;
import revature.fsd.project1.model.Movie;


public class MovieOptionHandler {
	public static void display() {
		System.out.println("1. Add The movie to Wish List");
		System.out.println("2. Play The movie");
		System.out.println("Select The option:");
		int option = App.scanner.nextInt();
		if(option==1) {
		WishListUpdateHandler.wishlistdisplay();
		System.out.println("Movie Added Into Your Wish List");
		UserMenuHandler.menudisplay();
		}
		else if(option ==2) {
			System.out.println("Enter the Movie Id To Play The Movie:");
			int id=App.scanner.nextInt();
			int unique = UserLogInDao.id;
			System.out.println("Movie is Playing....!");
			System.out.println("Thanks for Watching The Movie");
			AddHistoryDao add = new AddHistoryDao();
			List<Movie> his = add.add(id, unique);
			UserMenuHandler.menudisplay();
		}
		else {
			System.out.println("Enter the Carect Option");
			MovieOptionHandler.display();
		}

	}

}
