package revature.fsd.project1.handler;

import java.util.List;

import revature.fsd.project1.app.App;
import revature.fsd.project1.dao.AlterTop5Dao;
import revature.fsd.project1.dao.SearchMoviesDao;
import revature.fsd.project1.dao.ViewTop5MoviesDao;
import revature.fsd.project1.model.Movie;

public class AdminTop5MoviesHandler {
	public static void display() {
		System.out.println("Current Top-5 Movies");
		System.out.println("*********************");
		ViewTop5MoviesDao view=new ViewTop5MoviesDao();
		List<Movie> at5m=view.show();
		at5m.forEach(System.out::println);
		System.out.println("Enter The id To Alter Top-5 Movies: ");
		int id=App.scanner.nextInt();
		System.out.println("Enter a keyword to Search Movie:");
		String keyword=App.scanner.next();
		SearchMoviesDao sr=new SearchMoviesDao();
		List<Movie> find=sr.Search(keyword);
		find.forEach(System.out::println);
		System.out.println("Enter the id to Add Top-5 movie:");
		int add=App.scanner.nextInt();
		AlterTop5Dao alt5=new AlterTop5Dao();
		List<Movie>al5=alt5.delete(add, id);
		System.out.println("Updated Top-5 Movie List Is:");
		System.out.println("****************************");
		ViewTop5MoviesDao vie=new ViewTop5MoviesDao();
		List<Movie> at5m1=vie.show();
		at5m1.forEach(System.out::println);
		AdminMenuHandler.display();
		
		}

}
