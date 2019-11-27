package com.service;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.entity.Employee;

import java.math.BigDecimal;
import java.util.List;

public class EmployeeService {
    private static EmployeeDao employeeDao = new EmployeeDaoImpl();

    public List<Employee> getAll(){
        return employeeDao.getAll();
    }

    public List<Employee> getEmps(BigDecimal salary,String username){
        return employeeDao.getEmps(salary,username);
    }

}
