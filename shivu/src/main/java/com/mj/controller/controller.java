package com.mj.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mj.model.mymodel;

@Controller

public class controller {
		@InitBinder
		public void initBinder(WebDataBinder dataBinder) {
			
			StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
			dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		}
		
		@RequestMapping(path="/home")
		public String Loginwithmodel(Model model) {
			model.addAttribute("model123", new mymodel());
			
			return "details";
		}
		
		@RequestMapping(path="/index")
		public String Loginwith() {
			
			
			return "index";
		}
		
		
		@RequestMapping(path="/fortest")
		public String Loginwithmodel2(@Valid @ModelAttribute("model123") mymodel mr,BindingResult results) {
			
			System.out.println("in model_2 funtion...id :"+mr.getUserId()+" pass : "+mr.getPwd()+" phone no : "+mr.getPhoneno());
			if(results.hasErrors()) {
				System.out.println("has some error");
			return "details";
		     }
			
			else {
				System.out.println("hasn't some error");
			return "model3";
			}
			
			
		}

}
