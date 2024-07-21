package designpatterns.factory.abstractfactory.flutterorreactnativemodular;

import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.button.Button;
import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.dropdown.Dropdown;
import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.menu.Menu;

public interface UIComponentFactory {
    Button createButton();

    Menu createMenuBar();

    Dropdown createDropdown();
}
