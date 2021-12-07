package com.unthinkable.Department.Controller;

import com.unthinkable.Department.Entity.Department;
import com.unthinkable.Department.Service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment() ");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id){
        log.info("Inside find Department By Id method of controller");
        return departmentService.findDepartmentById(id);
    }
}
