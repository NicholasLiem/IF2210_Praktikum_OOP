public class BlueCard extends Card{
    public BlueCard(){
        super();
    }

    public BlueCard(Double number){
        super(number);
    }

    public Double getNumber(){
        return super.getNumber();
    }

    public void setNumber(Double number){
        super.setNumber(number);
    }

    public void printInfo(){
        System.out.println("Kartu Biru: " + this.getNumber());
    }
    public Double value(){
        return this.getNumber() + 0.1;
    }    
}
