package com.chen.www.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chen.www.entity.User;
import com.chen.www.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository;

//	@RequestMapping("login.do")
//	public String login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
//		String username = httpServletRequest.getParameter("username");
//		String password = httpServletRequest.getParameter("password");
//		User user = userRepository.findByUsername(username);
//		if(user ==null){
//			return "/error";
//		}
//		if(user.getPassword() == password){
//			//return "/"+username;
//			return "/hello";
//		}
//		
//		return "";
//	}
	
	@RequestMapping("/login")
	public String loginView(){
		return "login";
	}
	
	@RequestMapping("/")
	public String home(){
		return "home";
	}
	
	
}
