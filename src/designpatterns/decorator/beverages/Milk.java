package designpatterns.decorator.beverages;

public class Milk implements Addon {

    private Beverage beverage;

    public Milk (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return 20 + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return "Milk Added to " + beverage.getDescription();
    }
}
