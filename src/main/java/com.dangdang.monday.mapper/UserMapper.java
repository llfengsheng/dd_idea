package com.dangdang.monday.mapper;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
	 void insertUser(String userName,String password);
	// User selectUser();
}
