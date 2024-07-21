package designpatterns.factory.abstractfactory.flutterorreactnativemodular.components.button;

public class AndroidButton extends Button {
    @Override
    public void createButton() {
        System.out.println("Android Button");
    }
}
