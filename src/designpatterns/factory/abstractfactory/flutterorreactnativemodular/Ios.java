package designpatterns.factory.abstractfactory.flutterorreactnativemodular;

public class Ios extends Platform {
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new IosUIComponentFactory();
    }
}
