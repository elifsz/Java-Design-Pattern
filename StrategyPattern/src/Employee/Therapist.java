package Employee;

import Promo.MediumPromo;

/**
 *
 * @author elif
 */
public class Therapist extends Employee {

    /**
     * In its constructor, the class can implement which promotion model it will
     * use. If it doesn't have a promotion, the system compensates if nothing is
     * written.
     */
    public Therapist() {
        pro = new MediumPromo();
    }

}
