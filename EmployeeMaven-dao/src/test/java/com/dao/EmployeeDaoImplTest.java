package com.dao;

import com.entity.Employee;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImplTest {

    @Test
    public void testGetAll(){
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        List<Employee> employees = employeeDao.getAll();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Test
    public void testGetEmps(){
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        List<Employee> employees = employeeDao.getEmps(BigDecimal.valueOf(500),"张");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Test
    public void testUpdateBatch(){
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee(BigDecimal.valueOf(100),0,"update1",1,33);
        Employee employee2 = new Employee(BigDecimal.valueOf(200),0,"update2",1,32);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeDao.updateBatch(employeeList);
    }

    @Test
    public void testUpdateBatchBySqlSessionFactory(){
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee(BigDecimal.valueOf(100),0,"update6",1,33);
        Employee employee2 = new Employee(BigDecimal.valueOf(200),0,"update7",1,32);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeDao.updateBatchBySqlSessionFactory(employeeList);
    }
}
