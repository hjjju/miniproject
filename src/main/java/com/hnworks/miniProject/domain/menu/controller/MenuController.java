package com.hnworks.miniProject.domain.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hnworks.miniProject.domain.menu.dto.MenuDto;
import com.hnworks.miniProject.domain.menu.dto.ResponseDto;
import com.hnworks.miniProject.domain.menu.service.MenuService;
import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;
import com.nexacro.xapi.data.PlatformData;
import com.nexacro.xapi.data.VariableList;

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

	@PostMapping("/saveMenu")
	public ResponseDto saveMenu(@RequestBody MenuDto menuDto) {

		boolean b = menuService.saveMenu(menuDto);

		if (b == true) {
			ResponseDto responseDto = new ResponseDto();
			responseDto.setMessage("ok");
			return responseDto;
		}
		ResponseDto responseDto = new ResponseDto();
		responseDto.setMessage("fail");
		return responseDto;

	}

	@GetMapping(path = "/menu.do", produces = "application/json")
	public ResponseEntity<NexacroResult> selectSampleList(@ParamDataSet(name = "input1") MenuDto menuDto) {

		// menuList가져오기
		List<MenuDto> menuList = menuService.getMenuList();

		// PlatformData 생성
		PlatformData department = new PlatformData();

		// VariableList 참조
		VariableList varList = department.getVariableList();

		// NexacroResult 생성
		NexacroResult result = new NexacroResult();

		result.addDataSet("output1", menuList);

		// return result;
		HttpHeaders headers = new HttpHeaders();
		ResponseEntity<NexacroResult> entity = new ResponseEntity<>(result, headers, HttpStatus.CREATED);

		return entity;
	}

}
