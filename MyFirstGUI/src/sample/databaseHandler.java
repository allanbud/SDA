package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class databaseHandler extends Configs {
    Connection dbConnection;
    public  Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" +
                dbHost + ":" +
                dbPort + "/" +
                dbName;

        //right click on mysql-connector-java-5.1.49.jar
        //add as Library
        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }

    public void registerUser(User user) {

        String insert = "INSERT INTO " +
                Constants.USER_TABLE + "(" +
                Constants.USER_FIRSTNAME + "," +
                Constants.USER_LASTNAME + "," +
                Constants.USER_USERNAME + "," +
                Constants.USER_PASSWORD + "," +
                Constants.USER_COUNTRY + "," +
                Constants.USER_GENDER + ")" +
                "VALUES(?,?,?,?,?,?)";

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = getDbConnection().prepareStatement(insert);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            preparedStatement.setString(1, user.getFirstName());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            preparedStatement.setString(2, user.getLastName());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            preparedStatement.setString(3, user.getUserName());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            preparedStatement.setString(4, user.getPassword());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            preparedStatement.setString(5, user.getCountry());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            preparedStatement.setString(6, user.getGender());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
