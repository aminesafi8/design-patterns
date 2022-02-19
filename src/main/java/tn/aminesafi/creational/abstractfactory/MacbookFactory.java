package tn.aminesafi.creational.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class MacbookFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    @Override
    public Computer createComputer() {
        return new Macbook(ram, hdd, cpu);
    }
}
