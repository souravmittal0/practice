package designpatterns.factory.factorymethod.flutterorreactnative;

public class Ios extends Platform {
    public Button createButton() {
        return new IosButton();
    }
}
