package revature.fsd.project1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import revature.fsd.project1.model.Movie;

public class AddHistoryDao {
	public List<Movie> add(int id,int unique) {
		List<Movie> movie=new ArrayList<>();
		String sql = "INSERT INTO history (history,userid) values(?,?)";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
				stmt.setInt(1,id);
				stmt.setInt(2, unique);
				stmt.executeUpdate();
	   	        
						
				
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		return movie;

}
}
