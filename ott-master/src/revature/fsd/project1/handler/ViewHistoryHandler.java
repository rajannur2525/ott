package revature.fsd.project1.handler;

import java.util.List;

import revature.fsd.project1.dao.UserLogInDao;
import revature.fsd.project1.dao.ViewHistoryDao;
import revature.fsd.project1.model.Movie;

public class ViewHistoryHandler {
	public static void display() {
	ViewHistoryDao ve = new ViewHistoryDao();
	int unique = UserLogInDao.id;
	List<Movie> lm=ve.showhis(unique);
	lm.forEach(System.out::println);
	UserMenuHandler.menudisplay();
	
	
}

}

