package com.dao;

import com.entity.Employee;
import com.util.MapperFactory;
import com.util.SqlSessionHelper;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.math.BigDecimal;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public List<Employee> getAll() {
        EmployeeDao employeeDao = MapperFactory.generateMapper(EmployeeDao.class);
        return employeeDao.getAll();
    }

    @Override
    public List<Employee> getEmps(BigDecimal salary,String username) {
        EmployeeDao employeeDao = MapperFactory.generateMapper(EmployeeDao.class);
        return employeeDao.getEmps(salary,username);
    }

    @Override
    public int updateBatch(List<Employee> employeeList) {
        EmployeeDao employeeDao = MapperFactory.generateMapper(EmployeeDao.class);
        return employeeDao.updateBatch(employeeList);
    }

    @Override
    public int update(Employee employee) {
        return 0;
    }

    public void updateBatchBySqlSessionFactory(List<Employee> employeeList){
        SqlSessionFactory sessionFactory = SqlSessionHelper.getFactory();
        SqlSession session = sessionFactory.openSession(ExecutorType.BATCH);
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        try {
            int size = employeeList.size();
            for (int i = 0;i < size;i++){
                Employee employee = employeeList.get(i);
                employeeDao.update(employee);
                if (i>0 && i%2==0 || i == size-1){
                    session.commit();
                }
            }
        }catch (Exception e){
            session.rollback();
            throw new RuntimeException(e);
        }finally {
            session.close();
        }
    }
}
