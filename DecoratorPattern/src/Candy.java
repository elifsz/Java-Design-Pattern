
/**
 *
 * @author elif
 */
/**
 * Without changing the class structure, the cake material to be used is taken and added.
 */
public class Candy extends CakeDecorator {

    public Candy(Cake cake) {
        super(cake);
    }

    @Override
    String getDescription() {
        return this.cake.getDescription() + "Selecting Candy\n";
    }

    @Override
    double cost() {
        return this.cake.cost() + 3.5;
    }

}
