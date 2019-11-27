package com.entity;

import java.math.BigDecimal;

public class Employee {

    private Integer id;
    private BigDecimal salary;
    private Integer gender;
    private String username;
    private Integer deptId;

    public Employee() {
    }

    public Employee(BigDecimal salary,Integer gender, String username, Integer deptId,Integer id) {
        this.salary = salary;
        this.gender = gender;
        this.username = username;
        this.deptId = deptId;
        this.id = id;

    }

    public Employee(BigDecimal salary,Integer gender, String username, Integer deptId) {
        this.salary = salary;
        this.gender = gender;
        this.username = username;
        this.deptId = deptId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                ", username='" + username + '\'' +
                ", deptId=" + deptId +
                '}';
    }
}
