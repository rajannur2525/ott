package revature.fsd.project1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import revature.fsd.project1.model.Movie;

public class AddWishListDao {
	public List<Movie> Movie(int id,int unique) {
		List<Movie> movie=new ArrayList<>();
		String sql = "INSERT INTO wishlist (wishid,user_id) values(?,?)";
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
