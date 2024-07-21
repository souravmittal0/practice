package designpatterns.factory.abstractfactory.flutterorreactnativemodular;

import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.button.Button;
import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.button.IosButton;
import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.dropdown.Dropdown;
import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.dropdown.IosDropdown;
import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.menu.IosMenu;
import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.menu.Menu;

public class IosUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenuBar() {
        return new IosMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }
}
