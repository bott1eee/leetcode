package pattern.decorate;

public class Cream extends Condiment{

    public Cream(Water water){
        this.water = water;
    }

    @Override
    public double cost() {
        return water.cost()+1;
    }
}
