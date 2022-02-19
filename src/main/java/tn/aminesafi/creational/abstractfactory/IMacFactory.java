package tn.aminesafi.creational.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class IMacFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    @Override
    public Computer createComputer() {
        return new IMac(ram, hdd, cpu);
    }
}
