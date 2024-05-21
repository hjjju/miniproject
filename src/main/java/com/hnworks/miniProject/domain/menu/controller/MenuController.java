package com.hnworks.miniProject.domain.menu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hnworks.miniProject.domain.menu.dto.MenuDto;
import com.hnworks.miniProject.domain.menu.dto.ResponseDto;
import com.hnworks.miniProject.domain.menu.service.MenuService;
import com.nexacro.java.xapi.data.DataSet;
import com.nexacro.java.xapi.data.DataTypes;
import com.nexacro.java.xapi.data.PlatformData;
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
//	@GetMapping("/menuList")
	@RequestMapping(value = "/menuList", method = RequestMethod.GET)
	public NexacroResult getMenuList() {
//		public List<String> getMenuList(HttpServletResponse res) throws PlatformException {
		System.out.println("get");
		log.info("test");

		List<MenuDto> menuList = menuService.getMenuList(); // ajax용

		NexacroResult result = new NexacroResult();
//		result.addDataSet("menuList",menuList);
//		result.
//		for(int i =0 ; i < menuList.size();i++) {
//			result.addDataSet("menuList",MenuDto.makeDtoDataSet(menuList.get(i)));
//		}

		DataSet reDataSet = new DataSet();
		reDataSet.addColumn("MENU_ID", DataTypes.BLOB);
		reDataSet.addColumn("MENU_NAME", DataTypes.STRING, 100);
		reDataSet.addColumn("PARENT_ID", DataTypes.STRING, 100);
		reDataSet.addColumn("MENU_ORDER", DataTypes.STRING, 100);
		reDataSet.addColumn("MENU_URL", DataTypes.STRING, 100);
		reDataSet.addColumn("USER_UN", DataTypes.INT, 4);

		// PlatformData 생성
		PlatformData outputData = new PlatformData();

		for (MenuDto menu : menuList) {
			
			//row추가하면서 row번호 리턴함
			int row = reDataSet.newRow();

			// 신규row에 데이터 추가
			reDataSet.set(row, "MENU_ID", menu.getMenuId());
			reDataSet.set(row, "MENU_NAME", menu.getMenuName());
			reDataSet.set(row, "PARENT_ID", menu.getParentId());
			reDataSet.set(row, "MENU_ORDER", menu.getMenuOrder());
			reDataSet.set(row, "MENU_URL", menu.getMenuUrl());
			reDataSet.set(row, "USER_UN", menu.getUseYn());
			
		}
		outputData.addDataSet(reDataSet);
		result.addDataSet("menuList",outputData);

		return result;

	}

}
