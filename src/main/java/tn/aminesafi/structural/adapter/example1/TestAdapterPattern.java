package tn.aminesafi.structural.adapter.example1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestAdapterPattern {

    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();
    }


    private static void testClassAdapter() {
        SocketAdapter sockAdapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(sockAdapter, 3);
        Volt v12 = getVolt(sockAdapter, 12);
        Volt v120 = getVolt(sockAdapter, 120);
        log.info("v3 volts using Class Adapter [{}]", v3.getVolts());
        log.info("v12 volts using Class Adapter [{}]", v12.getVolts());
        log.info("v120 volts using Class Adapter [{}]", v120.getVolts());
    }

    private static void testObjectAdapter() {
        SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(sockAdapter, 3);
        Volt v12 = getVolt(sockAdapter, 12);
        Volt v120 = getVolt(sockAdapter, 120);
        log.info("v3 volts using Object Adapter [{}]", v3.getVolts());
        log.info("v12 volts using Object Adapter [{}]", v12.getVolts());
        log.info("v120 volts using Object Adapter [{}]", v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        switch (i) {
            case 3:
                return sockAdapter.get3Volt();
            case 12:
                return sockAdapter.get12Volt();
            case 120:
            default:
                return sockAdapter.get120Volt();
        }
    }
}
