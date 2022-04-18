package revature.fsd.project1.handler;

import java.util.List;

import revature.fsd.project1.app.App;
import revature.fsd.project1.dao.ModifyMovieDetailsDao;
import revature.fsd.project1.dao.SearchMoviesDao;
import revature.fsd.project1.model.Movie;

public class ModifyMovieDetailshandler {
	public static void display() {
	System.out.println("Find Movie");
	System.out.println("**********");
	System.out.println("Seacrh Movie Name:");
	String Keyword = App.scanner.next();
	SearchMoviesDao se=new SearchMoviesDao();
	 List<Movie> su=se.Search(Keyword);
	 su.forEach(System.out::println);
	 System.out.println("Select movie id to update (Enter Id):");
	 int id=App.scanner.nextInt();
	 System.out.println("Enter the Detail To Update:");
	 String name=App.scanner.nextLine();
	 name+=App.scanner.nextLine();
	 ModifyMovieDetailsDao mmdd=new ModifyMovieDetailsDao();
	 List<Movie>movie=mmdd.Movie(name,id);
	 System.out.println("Detail Updated Successfully");
	 AdminMenuHandler.display();
	 
	
	 

}
}
