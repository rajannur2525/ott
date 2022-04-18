package revature.fsd.project1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import revature.fsd.project1.model.Movie;

public class MovieDao {
	public List<Movie> findAll() {
		String sql = "select * from department";
		List<Movie> movies = new ArrayList<>();
		try (
			Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
		) {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Movie movie = new Movie();
				movie.setId(rs.getInt("id"));
				movie.setName(rs.getString("name"));
				movies.add(movie);
			}
		} catch (SQLException e) {
			Util.displayMessage(e);
		}
		return movies;
	}

}