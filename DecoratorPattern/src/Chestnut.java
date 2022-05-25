/**
 *
 * @author elif
 */
/**
 * Without changing the class structure, the cake material to be used is taken and added.
 */
public class Chestnut extends CakeDecorator {

     public Chestnut(Cake cake) {
        super(cake);
    }

    @Override
    String getDescription() {
        return this.cake.getDescription() + "Selecting Chestnut\n";
    }

    @Override
    double cost() {
        return this.cake.cost() + 5;
    }
    
}
