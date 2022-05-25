package Subject;

import Observer.Observer;
import Subject.Subject;
import java.util.ArrayList;
/**
 *
 * @author elif
 */

public class WarningSystem implements Subject {

    private ArrayList<Observer> observers;
    private String msg = "";

    public WarningSystem() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i < 0) {
            System.out.println("The observer you are looking for cannot be found");
        } else {
            this.observers.remove(observer);
        }
    }

    //Status updates are made according to the preferences of each observer.
    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(msg);
        }
    }

    public void setMessage(String message) {
        this.msg = message;
        statusChanged();
    }
    
    public String getMessage(){
        return this.msg;
    }

    public void statusChanged() {
        notifyObservers();       
    }

}
