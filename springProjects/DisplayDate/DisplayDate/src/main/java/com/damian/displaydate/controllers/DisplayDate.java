package com.damian.displaydate.controllers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class DisplayDate {
	@RequestMapping("")
	public String index() {
		return "index";
	}
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
	@RequestMapping("/date")
	public String date(Model model) {
		model.addAttribute("dojoName", dateFormat.format(date));
		return "date";
	}
	DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
	Date time = new Date();
	@RequestMapping("/time")
	public String time(Model model) {
		model.addAttribute("time", timeFormat.format(time));
		return "time";
	}
}
