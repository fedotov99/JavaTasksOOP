package com.company;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return getFirstName() + " " + getLastName();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    int raiseSalary(int percent) {
        float coeff = 1 + (float)percent / 100;
        setSalary(Math.round(salary * coeff));
        return getSalary();
    }

    @Override
    public String toString() {
        return "Employee[" + "id=" + id + ", name='" + getName() + ", salary=" + salary + "]";
    }
}
