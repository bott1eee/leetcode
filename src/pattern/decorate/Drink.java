package pattern.decorate;

public class Drink implements Water{
    @Override
    public double cost() {
        return 1;
    }
}
