package com.hnworks.miniProject.domain.menu.controller;

import java.util.List;

import com.nexacro.xapi.data.DataSet;
import com.nexacro.xapi.data.DataTypes;
import com.nexacro.xapi.tx.HttpPlatformResponse;
import com.nexacro.xapi.tx.PlatformException;
import com.nexacro.xapi.tx.PlatformType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

//	@GetMapping(path = "/menu.do", produces = "application/json")
//@RequestMapping(value = "/menuList",method = RequestMethod.GET)
@GetMapping("/menuList")
//	public ResponseEntity<NexacroResult> selectSampleList(@ParamDataSet(name = "input1") MenuDto menuDto) {
public NexacroResult getMenuList() throws PlatformException {
//	res.setCharset("UTF-8");

	List<MenuDto> menuList = menuService.getMenuList();

		// menuList가져오기




		// VariableList 참조
//		VariableList varList = department.getVariableList();

		DataSet reDataSet = new DataSet("response");

		reDataSet.addColumn("MENU_ID", DataTypes.STRING,100);
		reDataSet.addColumn("MENU_NAME", DataTypes.STRING,100);
		reDataSet.addColumn("PARENT_ID", DataTypes.STRING,100);
		reDataSet.addColumn("MENU_ORDER", DataTypes.STRING,100);
		reDataSet.addColumn("MENU_URL", DataTypes.STRING,100);
		reDataSet.addColumn("USER_UN", DataTypes.INT,4);

		// PlatformData 생성
		PlatformData outputData = new PlatformData();

		for (MenuDto menu: menuList
		) {
			int row = reDataSet.newRow();

			//신규row에 데이터 추가
			reDataSet.set(row,"MENU_ID",menu.getMenuId());
			reDataSet.set(row,"MENU_NAME",menu.getMenuName());
			reDataSet.set(row,"PARENT_ID",menu.getParentId());
			reDataSet.set(row,"MENU_ORDER",menu.getMenuOrder());
			reDataSet.set(row,"MENU_URL",menu.getMenuUrl());
			reDataSet.set(row,"USER_UN",menu.getUseYn());
		}

		outputData.addDataSet(reDataSet);
//		HttpPlatformResponse resData = new HttpPlatformResponse(res, PlatformType.CONTENT_TYPE_XML,"UTF-8");
//		resData.setData(outputData);
//		res.sendData();








		// return result;
//		HttpHeaders headers = new HttpHeaders();
//		ResponseEntity<NexacroResult> entity = new ResponseEntity<>(result, headers, HttpStatus.CREATED);

//		return entity;


	// NexacroResult 생성
		NexacroResult result = new NexacroResult();


		result.addDataSet("ds_menuList", menuList);
		return result;

}

}
