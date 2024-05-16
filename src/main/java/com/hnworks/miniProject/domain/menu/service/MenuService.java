package com.hnworks.miniProject.domain.menu.service;

import java.util.List;
import java.util.Map;

import com.hnworks.miniProject.domain.menu.dto.MenuDto;

public interface MenuService {

	boolean saveMenu(MenuDto menuDto);


//	List<MenuDto> getMenuList();

//	List<Map<String, Object>> getMenuList();


//	List<Map<String, Object>> getMenuList(Map<String, String> ds_menu);


	List<MenuDto> getMenuList(MenuDto menuDto);
}
