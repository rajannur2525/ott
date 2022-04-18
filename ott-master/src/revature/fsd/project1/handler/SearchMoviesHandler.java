package revature.fsd.project1.handler;

import java.util.List;

import revature.fsd.project1.app.App;
import revature.fsd.project1.dao.SearchMoviesDao;
import revature.fsd.project1.model.*;



public class SearchMoviesHandler {
	public static void Search() {
		
		System.out.println("Find Movie");
		System.out.println("**********");
		System.out.println("Seacrh Movie Name:");
		String Keyword = App.scanner.next();
		SearchMoviesDao se=new SearchMoviesDao();
		 List<Movie> su=se.Search(Keyword);
		 su.forEach(System.out::println);
		 MovieOptionHandler.display();
		 
	}

}