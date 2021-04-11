package com.department.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.service.entity.Department;
import com.department.service.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long deparmentId) {
		return departmentRepository.findByDepartmentId(deparmentId);
	}
}
