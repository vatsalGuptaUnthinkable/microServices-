package com.unthinkable.Employee.Entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ResponseTemplate {

    private Employee employee;
    private Department department;

}
