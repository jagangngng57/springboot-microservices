package com.user.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.service.entity.User;
import com.user.service.repository.UserRepository;
import com.user.service.vo.Department;
import com.user.service.vo.ResponseTemplateVO;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUsers(User user) {
		
		return repository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		
		ResponseTemplateVO vo = new ResponseTemplateVO();
		
		User users = repository.findByUserId(userId);
		
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" +users.getDepartmentId(),
				Department.class);
		
		vo.setUsers(users);
		vo.setDepartment(department);
		return vo;
	}

}
