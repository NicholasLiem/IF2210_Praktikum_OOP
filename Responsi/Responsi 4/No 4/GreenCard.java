public class GreenCard extends Card{
    public GreenCard(){
        super();
    }

    public GreenCard(Double number){
        super(number);
    }

    public Double getNumber(){
        return super.getNumber();
    }

    public void setNumber(Double number){
        super.setNumber(number);
    }

    public void printInfo(){
        System.out.println("Kartu Hijau: " + this.getNumber());
    }
    public Double value(){
        return this.getNumber();
    }    
}
