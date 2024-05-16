package com.hnworks.miniProject.domain.menu.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hnworks.miniProject.domain.member.respository.MemberRepository;
import com.hnworks.miniProject.domain.menu.dto.MenuDto;
import com.hnworks.miniProject.domain.menu.entity.MenuEntity;
import com.hnworks.miniProject.domain.menu.repository.MenuRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MenuServiceImpl implements MenuService {

	private final MenuRepository menuRepository;

	public MenuServiceImpl(MenuRepository menuRepository) {
		super();
		this.menuRepository = menuRepository;
	}

	@Override
	public boolean saveMenu(MenuDto menuDto) {
		menuRepository.save(menuDto);
		
		
	
		log.info("service");

		return true;
	}

//	@Override
//	public List<Map<String, Object>> getMenuList() {
//		List<Map<String,Object>> menuList = menuRepository.getMenuList();
//		return menuList;
//	}

//	@Override
//	public List<Map<String, Object>> getMenuList(Map<String, String> ds_menu) {
//		return menuRepository.getMenuList(ds_menu);
//	}

	@Override
	public List<MenuDto> getMenuList(MenuDto menuDto) {
		return menuRepository.getMenuList(menuDto);
	}

/*
	@Override
	public List<MenuDto> getMenuList() {

		// entity ->dto변경 
//		List<MenuDto> menuList = menuRepository.getMenuList().stream().map(MenuDto::of).collect(Collectors.toList());
		List<MenuDto> menuList = menuRepository.getMenuList();


		return menuList;
	}
*/

}
