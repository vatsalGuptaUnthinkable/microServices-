package com.unthinkable.Employee.Service;

import com.unthinkable.Employee.Entity.Employee;
import com.unthinkable.Employee.Entity.ResponseTemplate;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    ResponseTemplate getUserWithDepartment(long id);
}
