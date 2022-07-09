package pattern.decorate_2;

public class Test {

    public static void main(String[] args) {
        Water water = new DarkRoast();
        water = new Milk(water);
        water = new Chocolate(water);
        System.out.println(water.cost());
    }
}
