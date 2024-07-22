package designpatterns.decorator.beverages;

public class Mocha implements Addon {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return 30 + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return "Mocha added to " + beverage.getDescription();
    }
}
