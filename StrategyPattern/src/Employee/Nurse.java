package Employee;

import Promo.LowPromo;

/**
 *
 * @author elif
 */
public class Nurse extends Employee {

    /**
     * In its constructor, the class can implement which promotion model it will
     * use. If it doesn't have a promotion, the system compensates if nothing is
     * written.
     */
    public Nurse() {
        pro = new LowPromo();
    }
}
