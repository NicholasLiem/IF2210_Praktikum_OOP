public class RedCard extends Card{
    public RedCard(){
        super();
    }

    public RedCard(Double number){
        super(number);
    }

    public Double getNumber(){
        return super.getNumber();
    }

    public void setNumber(Double number){
        super.setNumber(number);
    }

    public void printInfo(){
        System.out.println("Kartu Merah: " + this.getNumber());
    }
    public Double value(){
        return this.getNumber() + 0.1;
    }    
}
