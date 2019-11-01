package com.company;

public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee(1, "Jack", "White", 10000);
        System.out.println(emp.raiseSalary(15));
    }
}
