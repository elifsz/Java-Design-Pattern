/**
 *
 * @author elif
 */
/**
 * Without changing the class structure, the cake material to be used is taken and added.
 */
public class Peanut extends CakeDecorator {

    public Peanut(Cake cake) {
        super(cake);
    }

    @Override
    String getDescription() {
        return this.cake.getDescription() + "Selecting Peanut\n";
    }

    @Override
    double cost() {
        return this.cake.cost() + 3;
    }

}
