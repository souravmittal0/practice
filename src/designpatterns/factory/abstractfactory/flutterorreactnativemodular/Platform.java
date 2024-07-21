package designpatterns.factory.abstractfactory.flutterorreactnativemodular;

public abstract class Platform {
    public void setRefreshRate(){

    }

    public void setTheme(){

    }

    public static Platform createPlatform(String platformName){
        return PlatformFactory.getPlatform(platformName);
    }

//    public Button createButton(){ //Factory Method
////        if(this is an instance of Android ){
////            return new AndroidButton();
////        } else if(this is an instance of IOS){
////            return new IOSButton();
////        }
//    }

    public abstract UIComponentFactory createUIComponentFactory();
}
