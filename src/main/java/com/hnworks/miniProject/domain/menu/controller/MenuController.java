package com.hnworks.miniProject.domain.menu.controller;

import org.springframework.web.bind.annotation.*;
import com.hnworks.miniProject.domain.menu.dto.MenuDto;
import com.hnworks.miniProject.domain.menu.dto.ResponseDto;
import com.hnworks.miniProject.domain.menu.service.MenuService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@AllArgsConstructor  //생성자 자동생성

public class MenuController {

	private final MenuService menuService;

	@PostMapping("/saveMenu")
	public ResponseDto saveMenu(@RequestBody MenuDto menuDto) {

	  ResponseDto responseDto = new ResponseDto();		
	  
	  // Save Menu 성공시 Ok, 실패시 fail 반환 
	  if (menuService.saveMenu(menuDto)) {                  
	    responseDto.setMessage("OK");
	    return responseDto;
	  } else {
		responseDto.setMessage("FAIL");
		return responseDto;		  
	  }
	}
	
	@RequestMapping("/menuList.do")
	public void getMenuList(){
//		res.setCharacterEncoding("UTF-8");
//	  NexacroResult result = new NexacroResult();
//	  ArrayList<Map<String,Object>> ds_menu = new ArrayList<>();
////      ds_menu =menuService.getMenuList2();
//	  List<MenuDto> menuList = menuService.getMenuList();
//	  
//	  for (MenuDto menuDto : menuList) {
//			log.info(menuDto.toString());
//		}
//	
//	  result.addDataSet("ds_menu",ds_menu);
//	  return result;

	}

	
	
	
	
	
	
}
