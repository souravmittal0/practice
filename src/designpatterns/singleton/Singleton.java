package designpatterns.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static Singleton INSTANCE = null;

    private Singleton() {
        if (INSTANCE != null) {
            throw new RuntimeException("Use getInstance()");
        }
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    protected Object readResolve() {
        return INSTANCE;
    }
}
