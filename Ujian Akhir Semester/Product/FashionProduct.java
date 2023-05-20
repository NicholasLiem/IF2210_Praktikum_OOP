public class FashionProduct extends Product{
    private String size;
    public FashionProduct(int ID, String name, int price, String description, String size){
        super(ID, name, price, description);
        this.size = size;
    }

    @Override
    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getID());
        sb.append(": ");
        sb.append(this.getName() + " - ");
        sb.append(this.getPrice() + " - ");
        sb.append(this.getSize() + " - ");
        sb.append(this.getDescription());
        return sb.toString(); 
    }

    public String getSize(){
        return size;
    }
    
}
