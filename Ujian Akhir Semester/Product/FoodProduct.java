public class FoodProduct extends Product{
    private String expiryDate;
    public FoodProduct(int ID, String name, int price, String description, String expiryDate){
        super(ID, name, price, description);
        this.expiryDate = expiryDate;
    }

    @Override
    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getID());
        sb.append(": ");
        sb.append(this.getName() + " - ");
        sb.append(this.getPrice() + " - ");
        sb.append(this.getExpiryDate() + " - ");
        sb.append(this.getDescription());
        return sb.toString(); 
    }

    public String getExpiryDate(){
        return expiryDate;
    }
    
}
