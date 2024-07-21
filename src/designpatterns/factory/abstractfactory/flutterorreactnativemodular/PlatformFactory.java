package designpatterns.factory.abstractfactory.flutterorreactnativemodular;

public class PlatformFactory {
    public static Platform getPlatform(String platformName) {
        if(platformName.equals("Android")){
            return new Android();
        } else if (platformName.equalsIgnoreCase("IOS")){
            return new Ios();
        }
        return null;
    }
}