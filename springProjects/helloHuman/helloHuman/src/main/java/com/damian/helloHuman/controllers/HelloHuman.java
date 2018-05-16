package com.damian.helloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloHuman {
@RequestMapping("/")
 public String index(Model model, @RequestParam(value="name") String searchQuery) {
	String str1 = searchQuery;
	if(str1.isEmpty()) {
		str1 = "Human";
	}
	model.addAttribute("name", str1);
	 return ("index");
 }
}
