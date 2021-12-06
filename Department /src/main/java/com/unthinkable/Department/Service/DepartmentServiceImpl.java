package com.unthinkable.Department.Service;

import com.unthinkable.Department.Entity.Department;
import com.unthinkable.Department.Repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;


    @Override
    public Department saveDepartment(Department department) {
      log.info("Inside saveDepartment() of Service class");
       return departmentRepository.save(department);
    }

    @Override
    public Department findDepartmentById(Long id) {
        log.info("Inside find By Id");
        return departmentRepository.findById(id).get();
    }

}
