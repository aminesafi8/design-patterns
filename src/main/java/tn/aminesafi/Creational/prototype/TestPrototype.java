package tn.aminesafi.Creational.prototype;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class TestPrototype {

    public static void main(String[] args) {
        Department department = new Department();
        department.loadData();

        // Use the clone method to get the Department object
        Department firstClonedDepartment = (Department) department.clone();
        Department secondClonedDepartment = (Department) department.clone();

        List<String> list = firstClonedDepartment.getEmployees();
        list.add("Platana");

        List<String> list1 = secondClonedDepartment.getEmployees();
        list1.remove("Sfx");

        log.info("Original Department Employees List: [{}]", department.getEmployees()); // remain the same
        log.info("firstClonedDepartment employees List: [{}] ", list);
        log.info("secondClonedDepartment employees List:[{}] ", list1);
    }

}
