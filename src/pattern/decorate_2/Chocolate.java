package pattern.decorate_2;

public class Chocolate extends Condiment {

    public Chocolate(Water water) {
        this.water = water;
    }

    @Override
    public int cost() {
        return water.cost() + 1;
    }
}
