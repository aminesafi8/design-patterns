package tn.aminesafi.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Department implements Cloneable {

    private List<String> employees;

    public Department() {
        employees = new ArrayList<>();
    }

    public Department(List<String> employees) {
        this.employees = employees;
    }

    public void loadData() {
        //read all employees from database and put into the list
        employees.add("Amine");
        employees.add("Nidhal");
        employees.add("Sfx");
        employees.add("Mohamed");
    }

    public List<String> getEmployees() {
        return employees;
    }

    @Override
    public Object clone() {
        List<String> temp = new ArrayList<>(this.getEmployees());
        return new Department(temp);
    }

}
