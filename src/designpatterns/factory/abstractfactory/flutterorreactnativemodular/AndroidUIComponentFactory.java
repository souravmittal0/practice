package designpatterns.factory.abstractfactory.flutterorreactnativemodular;

import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.button.AndroidButton;
import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.button.Button;
import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.dropdown.AndroidDropdown;
import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.dropdown.Dropdown;
import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.menu.AndroidMenu;
import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenuBar() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
