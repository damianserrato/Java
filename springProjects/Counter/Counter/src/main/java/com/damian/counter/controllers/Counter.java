package com.damian.counter.controllers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class Counter {
	@RequestMapping("")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(false);
		if (session == null) {
		session = request.getSession(true);
		Integer hitCount = new Integer(0);
		session.setAttribute("count", hitCount);
		}
		Integer hitCount = (Integer) session.getAttribute("count");
		hitCount = new Integer(hitCount.intValue() + 1);
		session.setAttribute("count", hitCount);
		return "index";
	}
	
}