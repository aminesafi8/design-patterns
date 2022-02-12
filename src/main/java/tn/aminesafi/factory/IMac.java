package tn.aminesafi.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IMac implements Computer {

    private String ram;
    private String hdd;
    private String cpu;


    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }
}
