package com.hnworks.miniProject.domain.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hnworks.miniProject.domain.member.dto.ResponseDto;
import com.hnworks.miniProject.domain.menu.dto.MenuDto;
import com.hnworks.miniProject.domain.menu.service.MenuService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
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

	@PostMapping("/saveMenu")
	public ResponseDto saveMenu(@RequestBody MenuDto menuDto) {

		log.info(menuDto.getName());
		log.info("/saveMenu");
		boolean b = menuService.saveMenu(menuDto);
		
		if(b == true) {
			ResponseDto responseDto = new ResponseDto();
			responseDto.setMessage("ok");
			return responseDto;
		}
		ResponseDto responseDto = new ResponseDto();
		responseDto.setMessage("fail");
		return responseDto;
		
	}


}
