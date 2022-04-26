package revature.fsd.project1.handler;

import java.util.List;

import revature.fsd.project1.app.App;
import revature.fsd.project1.dao.AddWishListDao;
import revature.fsd.project1.dao.UserLogInDao;
import revature.fsd.project1.model.Movie;

public class WishListUpdateHandler {
	public static void wishlistdisplay() {
		System.out.println("Enter The Movie id To Add Movie Into Wish List:");
		 int id = App.scanner.nextInt();
		 int unique= UserLogInDao.id;
		 AddWishListDao awl=new AddWishListDao(); 
		 List<Movie>mid=awl.Movie(id,unique);
		
	}

}
