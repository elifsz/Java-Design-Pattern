package Subject;

import Observer.Observer;
/**
 *
 * @author elif
 */
/**
 * Observable class has a has-a relationship to the Observer class because
 * it must know who the Observers are for necessary updates.
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
