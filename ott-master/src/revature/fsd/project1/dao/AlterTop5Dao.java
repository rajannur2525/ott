package revature.fsd.project1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import revature.fsd.project1.model.Movie;

public class AlterTop5Dao {
	
		public List<Movie> delete(int add, int id){
			String sql= "update top5movies set top5movies =? where id=?";
			List<Movie> movies = new ArrayList<>();
			try(
					Connection connection = Util.getConnection();
					PreparedStatement stmt = connection.prepareStatement(sql);
					){
		                 stmt.setInt(1,add);
		                 stmt.setInt(2, id);
		                 stmt.executeUpdate();
		}catch(SQLException e) {
			Util.displayMessage(e);
		}
			return movies;
		}
	}


