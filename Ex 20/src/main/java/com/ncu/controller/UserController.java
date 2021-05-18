package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ncu.model.User;

@Controller
@RequestMapping("/lame")
public class UserController {

	@RequestMapping("/info")
	public String userInfo(@SessionAttribute("user") User user) {

		System.out.println("Email: " + user.getEmail());
		System.out.println("First Name: " + user.getFname());

		return "usersession";
	}
}