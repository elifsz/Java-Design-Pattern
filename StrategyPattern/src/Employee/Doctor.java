package Employee;

import Promo.HighPromo;

/**
 *
 * @author elif
 */
public class Doctor extends Employee {

    /**
     * In its constructor, the class can implement which promotion model it will
     * use. If it doesn't have a promotion, the system compensates if nothing is
     * written.
     */
    public Doctor() {
        pro = new HighPromo();
    }
}
