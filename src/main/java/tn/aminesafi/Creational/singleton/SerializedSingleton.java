package tn.aminesafi.Creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    /**
     * To ensure the singleton design pattern (otherwise we will get two different hashCodes)
     *
     * @return
     */
    protected Object readResolve() {
        return SerializedSingleton.getInstance();
    }

}