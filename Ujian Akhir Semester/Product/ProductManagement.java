import java.util.*;

interface ProductManagement{
    void addProduct(Product newProduct);
    Product removeProduct(int id);
    void updateProduct(int id, String name, int price, String description);
    List<Product> getAllProduct();
    Product getProduct(int id);
}