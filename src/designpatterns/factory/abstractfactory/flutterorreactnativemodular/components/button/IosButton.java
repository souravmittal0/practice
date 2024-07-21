package designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.button;

public class IosButton extends Button {
    @Override
    public void createButton() {
        System.out.println("Ios Button");
    }
}
