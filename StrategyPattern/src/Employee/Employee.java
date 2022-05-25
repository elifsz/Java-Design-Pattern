package Employee;

import Promo.IPromo;

/**
 *
 * @author elif
 */

/**Employee cannot be instantiated 
* as a person in the hospital system, so it must be abstract.
*/
public abstract class Employee {

    /**Since the promotion structure may change, 
     * a has-a relationship has been established between Employee 
     * IPromo so that it can be changed more easily.
     */
    public IPromo pro;
}
