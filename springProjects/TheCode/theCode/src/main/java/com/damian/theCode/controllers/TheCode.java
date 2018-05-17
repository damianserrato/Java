package com.damian.theCode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCode {
	@RequestMapping("/")
	public String index(@ModelAttribute("errors") String errors) {
		return("index");
	}
	@RequestMapping(path="/errors", method=RequestMethod.POST)
	public String errors(RedirectAttributes redirectAttributes, @RequestParam(value="content") String content) {
		System.out.println(content);
		if(!content.equals("bushido")) {
		redirectAttributes.addFlashAttribute("errors", "You must train harder!");
		}
		else {
			return("code");
		}
		return "redirect:/";
	}
}