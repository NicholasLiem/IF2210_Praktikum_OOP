public class YellowCard extends Card{
    public YellowCard(){
        super();
    }

    public YellowCard(Double number){
        super(number);
    }

    public Double getNumber(){
        return super.getNumber();
    }

    public void setNumber(Double number){
        super.setNumber(number);
    }

    public void printInfo(){
        System.out.println("Kartu Kuning: " + this.getNumber());
    }
    public Double value(){
        return this.getNumber() + 0.2;
    }    
}
