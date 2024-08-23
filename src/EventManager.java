import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<EventObserver> observers;

    public EventManager() {
        this.observers = new ArrayList<>();
    }

    
    public void addObserver(EventObserver observer) {
        observers.add(observer);
    }

    
    public void removeObserver(EventObserver observer) {
        observers.remove(observer);
    }

    
    public void notifyObservers(String event) {
        for (EventObserver observer : observers) {
            observer.update(event);
        }
    }
}
