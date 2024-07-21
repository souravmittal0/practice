package designpatterns.factory.factorymethod.flutterorreactnative;

public class Android extends Platform {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
