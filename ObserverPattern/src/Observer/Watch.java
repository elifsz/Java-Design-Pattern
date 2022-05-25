package Observer;

import Subject.Subject;

/**
 *
 * @author elif
 */
/**
 * There must be a has-a relationship between the Observable class and the
 * observable class because the observers will implement the registration
 * process.
 */
public class Watch implements Observer, DisplayMesage {

    private Subject warningSystem;
    private String msg;

    public Watch(Subject warningSystems) {
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
        return "Watch message show screen--> " + msg;
    }
}
