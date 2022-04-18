package revature.fsd.project1.handler;

import java.util.List;

import revature.fsd.project1.dao.ViewTop5MoviesDao;
import revature.fsd.project1.model.Movie;

public class Top5MoviesHandler {
	public static void display() {
		System.out.println("The Top-5 Movies");
		System.out.println("****************");
		ViewTop5MoviesDao vt5= new ViewTop5MoviesDao();
		List<Movie> at5m=vt5.show();
		at5m.forEach(System.out::println);
		MovieOptionHandler.display();
		
	}

}
