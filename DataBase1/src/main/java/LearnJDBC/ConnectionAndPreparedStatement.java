package LearnJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionAndPreparedStatement {

  public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost:3306/McProjectFaceDB?ServerTimeZone=UTC";

    String username = "root";
    String password = "SurokSurok";

    Connection connection = DriverManager.getConnection(url, username, password);
    Statement statement = connection.createStatement();

    String sqlQuery =  "SELECT * FROM users";

    ResultSet resultSet = statement.executeQuery(sqlQuery);

    while (resultSet.next()){
      String user_name = resultSet.getString("username");
      System.out.println("Name: "+user_name);
    }

    statement.close();
    connection.close();
  }
}
