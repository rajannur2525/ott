package revature.fsd.project1.handler;

import java.util.List;

import revature.fsd.project1.model.Movie;
import revature.fsd.project1.dao.MovieDao;

public class MovieHandler {
	
	public static void displayMovies() {
		System.out.println("Movie List");
		System.out.println("**********");
		MovieDao dao = new MovieDao();
		List<Movie> movies = dao.findAll();
		
		System.out.printf("%8s %-60s\n", " Id", "    Name");
		System.out.printf("%8s %-60s\n", " ==", "    ====");
		movies.forEach(System.out::println);
		System.out.println();
		MovieOptionHandler.display();
	}


}
