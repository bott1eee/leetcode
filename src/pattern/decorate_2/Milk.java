package pattern.decorate_2;

public class Milk extends Condiment {

    public Milk(Water water) {
        this.water = water;
    }

    @Override
    public int cost() {
        return water.cost() + 1;
    }
}
