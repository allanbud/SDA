package products;

import database.DBHandler;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductRepository {

  private DBHandler dbHandler = new DBHandler();
  private Statement statement = dbHandler.createStatement();

  public String getAllProducts(){
    String response = "";

    try{

      String sqlQuery = "SELECT * FROM products";

      ResultSet results = statement.executeQuery(sqlQuery);

      response +=
          "LIST OF PRODUCTS\n"
          + "SN"
          + "\t Name"
          + "\t Price"
          + "\t Currency"
      ;

      while(results.next()){
        int productId = results.getInt("id");
        String productName = results.getString("product_name");
        Float price = results.getFloat("price");
        String currency = results.getString("currency_code");

        response +=
            "\n" + productId
            + "\t" + productName
            + "\t" + price
            + "\t" + currency
        ;

      }
      return response;
    }catch (SQLException e){
      e.printStackTrace();
    }
    return "no product found";
  }

}
