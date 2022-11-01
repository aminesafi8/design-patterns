package tn.aminesafi.template;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Brewing Tea!");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon!!");
    }
}
