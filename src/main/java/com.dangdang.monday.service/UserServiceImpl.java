package com.dangdang.monday.service;

import com.dangdang.monday.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;
	public void insertUser(String userName, String password) {
		
		this.userMapper.insertUser(userName, password);
	}

	/*public User selectUser() {
		
		return this.userMapper.selectUser();
	}*/
	
}
