package designpatterns.factory.factorymethod.flutterorreactnative;

public class Client {
    public static void main(String[] args) {
        Platform platform = new Android();
        Button button = platform.createButton();
        button.describeButton();
    }
}
