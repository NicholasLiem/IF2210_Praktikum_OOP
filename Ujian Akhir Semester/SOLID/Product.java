public class Product{
    private String name;
    private double price; 
 
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
 
 
    public String getName() {
        return name;
    }
 
 
    public double getPrice() {
        return price;
    }
 
    // Metode untuk menghitung pajak
    // @Override
    // public double calculateTax() {
    //     return price * 0.1;
    // }
 }
 
 
 public class FoodProduct extends Product {
    public FoodProduct(String name, double price) {
        super(name, price);
    }
 
    // Override metode calculateTax()
    // @Override
    // public double calculateTax() {
    //     return 0; // Tidak ada pajak untuk produk makanan
    // }
 }
 
 
 public class ElectronicsProduct extends Product implements Taxable{
    public ElectronicsProduct(String name, double price) {
        super(name, price);
    }
 
 
    // Override metode calculateTax()
    @Override
    public double calculateTax() {
        return price * 0.2; // Pajak khusus untuk produk elektronik
    }
 }
 