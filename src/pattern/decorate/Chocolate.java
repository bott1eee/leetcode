package pattern.decorate;

public class Chocolate extends Condiment {

    public Chocolate(Water water) {
        this.water = water;
    }

    @Override
    public double cost() {
        return water.cost() + 1;
    }
}
