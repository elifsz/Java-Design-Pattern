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
public class CellPhone implements Observer, DisplayMesage {

    private Subject warningSystem;
    String msg;

    public CellPhone(Subject warningSystems) {
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
        return "a toast message is displayed for 15 seconds as--> " + msg;
    }

}
