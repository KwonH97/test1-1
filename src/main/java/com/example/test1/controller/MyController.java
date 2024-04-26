package com.example.test1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test1.dao.ISimpleBbsDao;

@Controller
public class MyController {
	
	@Autowired
	private ISimpleBbsDao dao;
	
	@RequestMapping("/")
	public String root() {
		
		return "index";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		
		model.addAttribute("list", dao.getList());
		
		return "list";
	}
}
