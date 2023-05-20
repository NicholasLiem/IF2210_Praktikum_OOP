public class SMS implements Observer{
    public SMS(){
    }

    @Override
    public void notifyUpdate() {
        System.out.println("Ada update... sending to SMS...");
    }
}