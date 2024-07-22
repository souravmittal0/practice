package designpatterns.decorator.beverages;

public class DarkRoast implements Beverage {
    @Override
    public int getCost() {
        return 80;
    }

    @Override
    public String getDescription() {
        return "DarkRoast Coffee";
    }
}
