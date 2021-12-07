package com.unthinkable.Employee.Service;

import com.unthinkable.Employee.Entity.Department;
import com.unthinkable.Employee.Entity.Employee;
import com.unthinkable.Employee.Entity.ResponseTemplate;
import com.unthinkable.Employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    @Override
    public ResponseTemplate getUserWithDepartment(long id) {
        Employee employee = employeeRepository.findById(id).get();
        Department department = restTemplate.getForObject("http://Department-Service/department/" + employee.getDepartmentId(),Department.class);
        ResponseTemplate responseTemplate = ResponseTemplate.builder()
                                            .employee(employee)
                                            .department(department)
                                            .build();
        return responseTemplate;
    }
}
