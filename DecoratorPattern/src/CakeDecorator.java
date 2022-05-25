
/**
 *
 * @author elif
 */
/**
 * The decorator pattern was used to make additions to the Chocolate/Fruit Cake class
 * derived from Cake without destroying its own structure. If it is deleted
 * later, there will be no change in the program.
 */


/**
 * The reason why it has both a business and a unique relationship with cake is to inform the decorator on which class to add. In addition, since it is a
 * Cake interface, Decorator's child classes must implement the Cake's functions
 * in terms of use.
 */
public abstract class CakeDecorator extends Cake {
    
    public Cake cake;
    public CakeDecorator(Cake cake){
        this.cake = cake;
    }
    
    @Override
    abstract String getDescription();
    
    @Override
    abstract double cost();
    
}
