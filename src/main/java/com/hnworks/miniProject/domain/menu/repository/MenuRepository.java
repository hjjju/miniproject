package com.hnworks.miniProject.domain.menu.repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.hnworks.miniProject.domain.menu.dto.MenuDto;
import com.hnworks.miniProject.domain.menu.entity.MenuEntity;

public interface MenuRepository {

	void save(MenuDto menuDto);

//	List<Map<String, Object>> getMenuList();

//	List<Map<String, Object>> getMenuList(Map<String, String> ds_menu);

	List<MenuDto> getMenuList(MenuDto menuDto);

//	List<MenuDto> getMenuList();



}
