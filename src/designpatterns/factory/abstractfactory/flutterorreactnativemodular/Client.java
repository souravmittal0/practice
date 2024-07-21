package designpatterns.factory.abstractfactory.flutterorreactnativemodular;

import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.dropdown.Dropdown;
import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.menu.Menu;
import designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.button.Button;

public class Client {
    public static void main(String[] args) {
//        Platform p = new Android();

        String platform = "Android";
        Platform p = Platform.createPlatform(platform);

        UIComponentFactory uiComponentFactory =  p.createUIComponentFactory();
        Button button = uiComponentFactory.createButton();
        Menu menu = uiComponentFactory.createMenuBar();
        Dropdown dropdown = uiComponentFactory.createDropdown();
    }
}