package designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.menu;

public class AndroidMenu extends Menu {
    @Override
    public void createMenu() {
        System.out.println("Android Menu");
    }
}
