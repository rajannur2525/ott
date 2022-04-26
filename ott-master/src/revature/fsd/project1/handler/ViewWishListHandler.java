package revature.fsd.project1.handler;

import java.util.List;

import revature.fsd.project1.dao.UserLogInDao;
import revature.fsd.project1.dao.ViewWishListDao;
import revature.fsd.project1.model.Movie;

public class ViewWishListHandler {
	public static void display() {
		System.out.println("Your wish List");
		System.out.println("**************");
		ViewWishListDao ve=new ViewWishListDao();
		int unique = UserLogInDao.id;
		List<Movie> lm=ve.vlmd(unique);
		lm.forEach(System.out::println);
		UserMenuHandler.menudisplay();
		
		
	}

}
