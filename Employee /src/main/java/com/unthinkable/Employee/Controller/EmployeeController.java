package com.unthinkable.Employee.Controller;


import com.unthinkable.Employee.Entity.Employee;
import com.unthinkable.Employee.Entity.ResponseTemplate;
import com.unthinkable.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public ResponseTemplate getUserWithDepartment(@PathVariable("id") long id){
        return employeeService.getUserWithDepartment(id);
    }
}
