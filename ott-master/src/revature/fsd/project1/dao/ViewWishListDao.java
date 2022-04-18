package revature.fsd.project1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import revature.fsd.project1.model.Movie;

public class ViewWishListDao {
	public List<Movie> vlmd(){
		List <Movie>vm= new ArrayList<>();
	String sql = "select * from wishlist join movie on wishid= movie.id";
	try (
			Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
		) {
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				Movie mv=new Movie();
				mv.setId(rs.getInt("id"));
				mv.setName(rs.getString("name"));
				vm.add(mv);
				
			}
			
		} catch (SQLException e) {
			Util.displayMessage(e);
		}
	return vm;

}
}


