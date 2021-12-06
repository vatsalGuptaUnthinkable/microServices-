package com.unthinkable.Employee.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {
    private long DepartmentId;
    private String departmentName;
    private String departmentHead;
}
