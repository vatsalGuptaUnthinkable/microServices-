package com.unthinkable.Department.Service;

import com.unthinkable.Department.Entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);
    Department findDepartmentById(Long id);
}
