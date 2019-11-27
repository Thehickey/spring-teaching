package com.dao;

import com.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 清淡欢颜
 */
public interface EmployeeDao {

    List<Employee> getAll();

    List<Employee> getEmps(@Param("salary") BigDecimal salary,@Param("username") String username);

    int updateBatch(List<Employee> employeeList);

    int update(Employee employee);

}
