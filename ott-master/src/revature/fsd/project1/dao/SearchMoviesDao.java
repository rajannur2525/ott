package revature.fsd.project1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import revature.fsd.project1.model.Movie;

public class SearchMoviesDao {
	public List<Movie> Search(String keyword) {
		List<Movie> search=new ArrayList<>();
		String sy="%";
	 String sql = String.format("select * from movie where name like '%s%s%s'",sy,keyword,sy);
			try (
					Connection connection = Util.getConnection();
					PreparedStatement stmt = connection.prepareStatement(sql);
				) {
					ResultSet rs = stmt.executeQuery();
					while (rs.next())  {
						   Movie m=new Movie();
						   m.setId(rs.getInt("id"));
						   m.setName(rs.getString("name"));
						   search.add(m);
					        
					}
						  
							
					
					
				} catch (SQLException e) {
					Util.displayMessage(e);
				}
			return search;

}
}
