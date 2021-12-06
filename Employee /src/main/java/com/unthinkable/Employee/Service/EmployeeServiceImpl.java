package com.unthinkable.Employee.Service;

import com.unthinkable.Employee.Entity.Employee;
import com.unthinkable.Employee.Entity.ResponseTemplate;
import com.unthinkable.Employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return null;
    }

    @Override

    public ResponseTemplate getUserWithDepartment(long id) {
        return null;
    }
}
