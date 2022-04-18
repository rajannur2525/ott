package revature.fsd.project1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import revature.fsd.project1.model.Movie;

public class ViewTop5MoviesDao {
	public List<Movie> show(){
		String sql= String.format("select * from top5movies join movie on top5movies= movie.id;");
		List<Movie>movies = new ArrayList<>();
		try(
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
				){
			ResultSet rs= stmt.executeQuery();
			while(rs.next()) {
				Movie movie = new Movie();
				movie.setId(rs.getInt("id"));
				movie.setName(rs.getString("name"));
				movies.add(movie);
			}
			
		}catch(SQLException e) {
			Util.displayMessage(e);
		}
		return movies;
	}

}
