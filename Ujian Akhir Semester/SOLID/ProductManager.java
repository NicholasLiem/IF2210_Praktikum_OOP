package SOLID;

public class ProductManager {

    private static List<Product> shoppingCarts = new ArrayList<>();
    
    public static void addProductToShoppingCart(Product product) {
        shoppingCarts.add(product);
    }
 
 
    public static void removeProductFromShoppingCart(Product product) {
        shoppingCarts.remove(product);
    }
 
 
    public static double calculateShoppingCartsTotalPrice() {
        double total = 0;
        for (Product product : shoppingCarts) {
            total += product.getPrice();
        }
        return total;
    }
    
}
