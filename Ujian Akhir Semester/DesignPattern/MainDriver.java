public class MainDriver {
    public static void main(String[] args){
        Email email1 = new Email();
        SMS sms1 = new SMS();
        PushNotification pn1 = new PushNotification();
        Subject IF2223 = new Subject();
        IF2223.addSubscriber(email1);
        IF2223.addSubscriber(sms1);
        IF2223.addSubscriber(pn1);
        IF2223.notifyAllSubscriber();
    }    
}
