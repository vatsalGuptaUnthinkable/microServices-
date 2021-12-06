package com.unthinkable.Department.Entity;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long DepartmentId;
    @NotBlank(message = "Department Name cannot be blank")
    private String departmentName;
    private String departmentHead;
}