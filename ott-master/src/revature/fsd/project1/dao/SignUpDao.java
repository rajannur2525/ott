package revature.fsd.project1.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import revature.fsd.project1.model.SignUp;

public class SignUpDao {
	public List<SignUp> Signup(String name,String mobile_no,String password) {
		List<SignUp> signup=new ArrayList<>();
		String sql = String.format("insert into user (name,mobile_no,password)values(?,?,?)");
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
				
					stmt.setString(1,name);
					stmt.setString(2,mobile_no);
					stmt.setString(3,password);
					stmt.executeUpdate();
				
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
			
			return signup;
	}

}
