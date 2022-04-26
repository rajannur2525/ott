package revature.fsd.project1.dao;

import java.sql.PreparedStatement;

import java.sql.*;

public class getUserIdDao {
public static int id(String name , String password) {
	int userid=0;
	String sql = String.format("select id from user where name='%s' and password='%s';", name,password);
	try(
		Connection con = Util.getConnection();
		PreparedStatement stmt =con.prepareStatement(sql);){
		ResultSet rs= stmt.executeQuery();
		while(rs.next()) {
			userid=rs.getInt("id");
		}
	}catch (SQLException e) {
		Util.displayMessage(e);
	}
	return userid;
}
}
