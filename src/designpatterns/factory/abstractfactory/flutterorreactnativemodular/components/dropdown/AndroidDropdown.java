package designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.dropdown;

public class AndroidDropdown extends Dropdown {
    @Override
    public void createDropdown() {
        System.out.println("Android Dropdown");
    }
}
