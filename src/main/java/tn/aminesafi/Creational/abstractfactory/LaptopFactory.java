package tn.aminesafi.Creational.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class LaptopFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    @Override
    public Computer createComputer() {
        return new Laptop(ram, hdd, cpu);
    }

}

