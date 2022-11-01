package tn.aminesafi.template;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Brewing Coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar!");
    }
}
