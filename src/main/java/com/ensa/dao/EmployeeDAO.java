package com.ensa.dao;

import org.springframework.stereotype.Repository;

import com.ensa.model.Employee;
import com.ensa.model.Employees;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
     
    static
    {
        list.getEmployeeList().add(new Employee(1, "wawawa", "wawawa", "wawawa@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "genie", "info", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "blablabla", "blabla", "blablabla@gmail.com"));
    }
     
    public Employees getAllEmployees() 
    {
        return list;
    }
     
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}