package com.hnworks.miniProject.domain.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hnworks.miniProject.domain.menu.service.MenuService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MenuController {

	private final MenuService menuService;
	
	@Autowired
	public MenuController(MenuService menuService) {
		super();
		this.menuService = menuService;
	}


	@GetMapping("/index")
	public String index() {
		log.info("Common");
		return "index";
	}



}
