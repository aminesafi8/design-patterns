package tn.aminesafi.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestAbstractFactory {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer iMac = ComputerFactory.getComputer(new IMacFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer macbook = ComputerFactory.getComputer(new MacbookFactory("16 GB", "1 TB", "2.9 GHz"));
        log.info("Factory Imac Config :: [{}]", iMac);
        log.info("Factory Macbook Config :: [{}]", macbook);
    }
}
