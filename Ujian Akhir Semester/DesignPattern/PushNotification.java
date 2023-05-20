public class PushNotification implements Observer{
    public PushNotification(){

    }

    @Override
    public void notifyUpdate() {
        System.out.println("Ada update... sending to notification...");
    }
}
