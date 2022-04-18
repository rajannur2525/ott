package revature.fsd.project1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import revature.fsd.project1.model.Movie;

public class ModifyMovieDetailsDao {
	public List<Movie> Movie(String name,int id) {
		List<Movie> movie=new ArrayList<>();
			 
	 String sql ="update movie set name =(?) where id=(?);";
			try (
					Connection connection = Util.getConnection();
					PreparedStatement stmt = connection.prepareStatement(sql);
				) {
					stmt.setString(1, name);
					stmt.setInt(2, id);
					stmt.executeUpdate();
					
				} catch (SQLException e) {
					Util.displayMessage(e);
				}
			return movie;

}
	

} 
