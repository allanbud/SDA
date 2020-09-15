import database.DBHandler;
import products.ProductController;
import products.ProductRepository;

public class Main {

  public static void main(String[] args) {
    ProductController productController = new ProductController();

    productController.showProducts();

  }
}
