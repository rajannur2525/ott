package revature.fsd.project1.handler;

import java.util.List;

import revature.fsd.project1.dao.ViewWishListDao;
import revature.fsd.project1.model.Movie;

public class ViewWishListHandler {
	public static void display() {
		System.out.println("Your wish List");
		System.out.println("**************");
		ViewWishListDao ve=new ViewWishListDao();
		List<Movie> lm=ve.vlmd();
		lm.forEach(System.out::println);
		UserMenuHandler.menudisplay();
		
		
	}

}
