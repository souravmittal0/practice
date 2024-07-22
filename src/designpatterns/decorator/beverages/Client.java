package designpatterns.decorator.beverages;

public class Client {
    public static void main(String[] args) {
        Beverage coffee = new DarkRoast();
        Beverage withAddon = new Mocha(coffee);
        System.out.println(withAddon.getDescription());
        System.out.println(withAddon.getCost());
    }
}
