package Observer;

/**
 *
 * @author elif
 */
/**
 * The update method may be different for each observer to be implemented, so
 * the observer class is used as an interface.
 */
public interface Observer {

    public void update(String msg);
}
