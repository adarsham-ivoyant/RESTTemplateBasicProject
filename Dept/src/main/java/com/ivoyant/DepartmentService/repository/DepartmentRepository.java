package com.ivoyant.DepartmentService.repository;

import com.ivoyant.DepartmentService.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
