import java.util.*;

public class ProductCatalog implements ProductManagement{
    List<Product> productList;

    public ProductCatalog(List<Product> products){
        this.productList = products;
    }
    @Override
    public void addProduct(Product newProduct) {
        this.productList.add(newProduct);        
    }

    @Override
    public Product removeProduct(int id){
        Product theProduct = this.getProduct(id);
        this.productList.remove(this.getProduct(id));
        return theProduct;
    }

    @Override
    public void updateProduct(int id, String name, int price, String description){
        Product theProduct = this.getProduct(id);
        if (theProduct != null){
        theProduct.setName(name);
        theProduct.setPrice(price);
        theProduct.setDescription(description);
        } else {
            System.out.println("Produk dengan id " + id + " tidak ditemukan");
        }
    }

    @Override
    public List<Product> getAllProduct(){
        return this.productList;
    }

    @Override
    public Product getProduct(int id){
        for (Product prod : productList){
            if (prod.getID() == id){
                return prod;
            }
        }
        return null;
    }
    
}
