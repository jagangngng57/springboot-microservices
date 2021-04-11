package com.user.service.vo;

import com.user.service.entity.User;

public class ResponseTemplateVO {
	
	private User users;
	private Department department;
	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
