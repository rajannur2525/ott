package revature.fsd.project1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import revature.fsd.project1.model.Movie;

public class AddWishListDao {
	public List<Movie> Movie(int id) {
		List<Movie> movie=new ArrayList<>();
		String sql = String.format("INSERT INTO wishlist SELECT (id,name) from movie WHERE id='%d'",id);
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
				stmt.setInt(1,id);
				stmt.executeUpdate();
	   	        
						
				
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		return movie;

}
}
