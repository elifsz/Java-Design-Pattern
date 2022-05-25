package Observer;

/**
 *
 * @author elif
 */
/**
 * Observers may not receive the same message, so special display messages are
 * made using the interface.
 */
public interface DisplayMesage {

    public String display(String msg);
}
