public abstract class Product {
    private int id;
    private String name;
    private int price;
    private String description;

    public Product(int id, String name, int price, String description){
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    abstract String getInfo();
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public void setID(int newID){
        id = newID;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setPrice(int newPrice){
        price = newPrice;
    }

    public void setDescription(String newDescription){
        description = newDescription;
    }
}
