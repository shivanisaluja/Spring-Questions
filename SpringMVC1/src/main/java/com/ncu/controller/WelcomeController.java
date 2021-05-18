package com.ncu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncu.model.Q3Model;
import com.ncu.model.Users;

@Controller
public class WelcomeController {

	@RequestMapping("/hello")
	public String welcomemsg() {
		return "index";
	}

//	@RequestMapping("/login")
//	public String doLogin(HttpServletRequest request, Model model) {
//		String userId=request.getParameter("userId");
//		model.addAttribute("msg", "login "+userId);
//		return "login";
//	}

//	@RequestMapping("/login")
//	public String doLogin(@RequestParam(required = false, name = "userId") String userId, Model model,
//			@ModelAttribute("Users") Users user) {
//		model.addAttribute("msg", "login " + userId);
//		return "login";
//	}

	@RequestMapping("/login")
	public String doLogin(@RequestParam(required = false, name = "userId") String userId, Model model) {
		model.addAttribute("msg", "login " + userId);
		model.addAttribute("Users", new Users("Grishav"));
		return "login";
	}

	@RequestMapping("/welcome")
	public String doLogin1(@ModelAttribute("Users") Users user, Model model) {
		model.addAttribute("msg", "login " + user.getUserId());
		return "welcome";
	}

//	@RequestMapping("/welcome")
//	public String doLogin1(@RequestParam(required = false, name = "userid") String userId,
//			@RequestParam(required = false, name = "pwd") String pwd, Model model) {
//		model.addAttribute("msg", "login " + userId);
//		return "welcome";
//	}

//	@RequestMapping("/login")
//	public String doLogin1(@ModelAttribute("Users") Users user, Model model) {
//		model.addAttribute("msg", "login " + user.getUserId());
//		return "login";
//	}

	@RequestMapping("/home")
	public String doLogin(Model model) {
		model.addAttribute("Q3Model", new Q3Model("Grishav", "20", "1234567890", "1234", "Male", "Address","CSE"));
		return "Q3Home";
	}

	@RequestMapping("/display")
	public String doLogin(Model model, String name, String age, String number, String password, String gender,
			String address, String course) {
		model.addAttribute("msg1", name);
		model.addAttribute("msg2", age);
		model.addAttribute("msg3", number);
		model.addAttribute("msg4", password);
		model.addAttribute("msg5", gender);
		model.addAttribute("msg6", address);
		model.addAttribute("msg7", course);
		return "Q3Display";
	}

}