package com.aashish.hrmanagement;



public class Employee {
    private int employeeid;
    private String employeename;
    private int phone;
    private int salary;

    public Employee(int employeeid, String employeename, int phone, int salary) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.phone = phone;
        this.salary = salary;
    }

    // Getters and setters
    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

