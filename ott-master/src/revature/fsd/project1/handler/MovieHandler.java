package revature.fsd.project1.handler;

import java.util.List;

import revature.fsd.project1.model.Movie;
import revature.fsd.project1.dao.MovieDao;

public class MovieHandler {
	
	public static void displayMovies() {
		MovieDao dao = new MovieDao();
		List<Movie> movies = dao.findAll();
		System.out.println("Movies");
		System.out.println();
		System.out.printf("%4s %-40s\n", "Id", "Name");
		System.out.printf("%4s %-40s\n", "==", "====");
		movies.forEach(e -> System.out.println(e));
		System.out.println();
		MainMenuHandler.display();
	}


}
