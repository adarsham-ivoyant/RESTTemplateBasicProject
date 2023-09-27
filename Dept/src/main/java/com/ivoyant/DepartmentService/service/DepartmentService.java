package com.ivoyant.DepartmentService.service;

import com.ivoyant.DepartmentService.entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}
