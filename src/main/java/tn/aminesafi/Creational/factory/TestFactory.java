package tn.aminesafi.Creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestFactory {

    public static void main(String[] args) {
        Computer macbook = ComputerFactory.getComputer("macbook", "2 GB", "500 GB", "2.4 GHz");
        Computer iMac = ComputerFactory.getComputer("iMac", "16 GB", "1 TB", "2.9 GHz");
        log.info("Factory Macbook Config :: [{}]", macbook);
        log.info("Factory Imac Config :: [{}]", iMac);
    }

}
