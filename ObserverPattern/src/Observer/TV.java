package Observer;

import Subject.Subject;
import Observer.Observer;
import Observer.DisplayMesage;

/**
 *
 * @author elif
 */
/**
 * There must be a has-a relationship between the Observable class and the
 * observable class because the observers will implement the registration
 * process.
 */
public class TV implements Observer, DisplayMesage {

    private Subject warningSystem;
    String msg;

    public TV(Subject warningSystems) {
        this.warningSystem = warningSystems;
        this.warningSystem.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        this.msg = display(msg);
    }

    public String getMessage() {
        return this.msg;
    }

    @Override
    public String display(String msg) {
        return "TV broads is stopped and streaming this on the screen--> " + msg;
    }

}
