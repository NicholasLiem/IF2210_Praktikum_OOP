import java.util.*;

public class Subject {
    private List<Observer> listOfObservers;

    public Subject(){
        listOfObservers = new ArrayList<>();
    }

    public void addSubscriber(Observer subscriber){
        listOfObservers.add(subscriber);
    }

    public void removeSubscriber(Observer s){
        this.listOfObservers.remove(s);
    }

    public void notifyAllSubscriber(){
        for (Observer s : listOfObservers){
            s.notifyUpdate();
        }
    }


}
