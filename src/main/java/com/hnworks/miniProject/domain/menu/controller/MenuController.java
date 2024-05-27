package com.hnworks.miniProject.domain.menu.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.hnworks.miniProject.domain.menu.dto.MenuDto;
import com.hnworks.miniProject.domain.menu.dto.ResponseDto;
import com.hnworks.miniProject.domain.menu.service.MenuService;
import com.nexacro.uiadapter.spring.core.data.NexacroResult;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@AllArgsConstructor // 생성자 자동생성
public class MenuController {

	static MenuDto dto;
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

	/*
	 * FUNCTION NAME : getMenuList DESCRIPTION : 메뉴리스트 조회 후 화면에 전달 PARAM : param1
	 * HttpServletResponse : param2 조회 객체2
	 */
	
	@CrossOrigin
	@RequestMapping(value = "/menuList", method = RequestMethod.GET)
	public NexacroResult getMenuList() {
		log.info("test");

				NexacroResult result = menuService.getMenuList(); // ajax용

		
		return result;

	}

}
