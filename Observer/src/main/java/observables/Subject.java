package observables;
import observers.Observer;
import java.util.ArrayList;
import java.util.List;

/**
 * represents the Subject class
 */
public class Subject {
    private String state;
    private List<Observer> observers = new ArrayList<>();

    /**
     * adds new observer to observers list
     * @param observer
     */
    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    /**
     * removes observer from observers list
     * @param observer
     */
    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    /**
     * notify all observers
     */
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    // getters and setters
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

}
