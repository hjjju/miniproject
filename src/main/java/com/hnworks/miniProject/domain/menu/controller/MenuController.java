package com.hnworks.miniProject.domain.menu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hnworks.miniProject.domain.member.dto.ResponseDto;
import com.hnworks.miniProject.domain.menu.dto.MenuDto;
import com.hnworks.miniProject.domain.menu.service.MenuService;
import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;
import com.nexacro.spring.data.convert.NexacroConverter;
import com.nexacro.xapi.data.DataSet;
import com.nexacro.xapi.data.PlatformData;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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

		log.info(menuDto.getMenuName());
		log.info("/saveMenu");
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
//*
	@GetMapping("/menu")
//	public NexacroResult getMenu() {
//		public NexacroResult getMenu(@ParamDataSet(name = "intpu1", required = false) Map<String, String> ds_menu) {
//	   public NexacroResult selectSampleList(HttpServletRequest req, HttpServletResponse res, PlatformData platformData,Model model) {
	  public NexacroResult selectSampleList(@ParamDataSet(name = "input1") MenuDto menuDto) {


		log.info("controller");
//		List<MenuDto> menuList = menuService.getMenuList();
		
//		List<Map<String,Object>> menuList = menuService.getMenuList();
//		List<Map<String,Object>> menuList = menuService.getMenuList(ds_menu); //input값
		
//		DataSet data1 = platformData.getDataSetList().get("input1");
		
		
//		NexacroResult result = new NexacroResult();
//		List<Map<String,Object>> menuList = menuService.getMenuList(); //input값
//		
//		
//		result.addDataSet("output1", menuList);
		
		
		
		
	    // SampleService에 searchVO 인자와 함께 전달
	    // 가져온 결과를 userList에 대입
	    List<MenuDto> menuList = menuService.getMenuList(menuDto);

	    // NexacroResult 생성
	    NexacroResult result = new NexacroResult();

	    // userList를 outData인 output1에 DataSet 저장
//	    result.addDataSet("output1", menuList);
	    result.addDataSet("output1", menuList);

		
		
//	    list를 hashmap에 담으면 json 형태로 인식이되고 dataset에는 형식이 맞지않아 output이 제대로 안되는거같네요
//	    List sampleList = new ArrayList(); 로만 구성하고 해당 List에 데이터를 삽입하여
//	    result.addDataSet("ds_list", sampleList);를 바로해보세요
		
		
		return result;
	}//*/
	
	

	
}
