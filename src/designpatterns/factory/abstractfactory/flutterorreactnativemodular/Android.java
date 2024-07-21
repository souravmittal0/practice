package designpatterns.factory.abstractfactory.flutterorreactnativemodular;

public class Android extends Platform {
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
