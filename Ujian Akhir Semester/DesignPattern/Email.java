public class Email implements Observer{
    public Email(){

    }

    @Override
    public void notifyUpdate() {
        System.out.println("Ada update... sending to email...");
    }
}
