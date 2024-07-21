package designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.dropdown;

public class IosDropdown extends Dropdown {
    @Override
    public void createDropdown() {
        System.out.println("Ios Dropdown");
    }
}
