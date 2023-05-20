public class ElectronicProduct extends Product{
    private String warrantyPeriod;
    public ElectronicProduct(int ID, String name, int price, String description, String warrantyPeriod){
        super(ID, name, price, description);
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyPeriod(){
        return warrantyPeriod;
    }

    @Override
    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getID());
        sb.append(": ");
        sb.append(this.getName() + " - ");
        sb.append(this.getPrice() + " - ");
        sb.append(this.getWarrantyPeriod() + " - ");
        sb.append(this.getDescription());
        return sb.toString(); 
    }
}
