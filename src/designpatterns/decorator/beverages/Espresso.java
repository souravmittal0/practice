package designpatterns.decorator.beverages;

public class Espresso implements Beverage {
    @Override
    public int getCost() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Espresso Coffee";
    }
}
