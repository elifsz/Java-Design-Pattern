package Promo;

/**
 *
 * @author elif
 */
/**
 * Since the promotions/algorithms are implemented differently, a separate class
 * is opened for each feature, and a design that is open to change has been made.
 */
public class HighPromo implements IPromo {

    @Override
    public double findPromo() {
        return 1000;
    }
    
}

