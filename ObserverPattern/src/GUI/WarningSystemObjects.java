package GUI;

import Observer.CellPhone;
import Observer.TV;
import Observer.Watch;
import Subject.WarningSystem;

/**
 *
 * @author elif
 */
public class WarningSystemObjects {

    //Warning system observer registration and message set operations
    public WarningSystem ws;
    public CellPhone myPhone;
    public TV myTV;
    public Watch myWatch;

    public WarningSystemObjects() {
        ws = new WarningSystem();

        myPhone = new CellPhone(ws);
        myTV = new TV(ws);
        myWatch = new Watch(ws);

        ws.setMessage("Hide");
    }
}
