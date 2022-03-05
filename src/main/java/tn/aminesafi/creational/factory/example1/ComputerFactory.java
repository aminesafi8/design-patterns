package tn.aminesafi.creational.factory.example1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("macbook".equalsIgnoreCase(type)) {
            return new Macbook(ram, hdd, cpu);
        }
        if ("imac".equalsIgnoreCase(type)) {
            return new IMac(ram, hdd, cpu);
        }

        log.error("Unknown computer type [{}]", type);
        throw new IllegalArgumentException("Unknown computer type");
    }
}
