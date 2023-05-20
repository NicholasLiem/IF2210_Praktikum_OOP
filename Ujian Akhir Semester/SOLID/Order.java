public class Order {
    private ShoppingCart shoppingCart;
    private PaymentProcessor paymentProcessor;
 
 
    public Order(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
        this.paymentProcessor = new PaymentProcessor();
    }
 
 
    public void checkout(String checkoutMethod) {
        double totalPrice = shoppingCart.calculateTotalPrice();
        paymentProcessor.process(totalPrice);
    }
 }
 