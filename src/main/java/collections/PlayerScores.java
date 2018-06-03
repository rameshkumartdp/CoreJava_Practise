package collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PlayerScores {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ramesh","kumar");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select player_id, avg(player_score) from playerscores group by player_id");
			System.out.println("Player final scores");
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("player_id")+"  "+resultSet.getInt("avg(player_score)"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	

	}

}
