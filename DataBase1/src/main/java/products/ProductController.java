package products;

public class ProductController {

  private ProductRepository productRepository = new ProductRepository();

  public ProductController() {

  }

  public void showProducts(){
    String response = productRepository.getAllProducts();
    System.out.println(response);
  }
}
