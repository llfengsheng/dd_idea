package com.dangdang.monday.controller;



import com.dangdang.monday.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/doregister")
public class UserController {
	@Resource
	private UserServiceImpl userServiceImpl;

	public String addUser(HttpServletRequest request){
		String sname = request.getParameter("name");
		String spas = request.getParameter("pas");
	
		this.userServiceImpl.insertUser(sname, spas);
		return "success";
	}
	
}
