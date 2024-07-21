package designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.menu;

public class IosMenu extends Menu {

    @Override
    public void createMenu() {
        System.out.println("Ios Menu");
    }
}
