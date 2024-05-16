package com.hnworks.miniProject.domain.menu.repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hnworks.miniProject.domain.menu.dto.MenuDto;
import com.hnworks.miniProject.domain.menu.entity.MenuEntity;
import com.hnworks.miniProject.domain.menu.mapper.MenuMapper;

@Component
public class MenuRepositoryImpl implements MenuRepository{
	
	private final MenuMapper menuMapper;

	@Autowired
	public MenuRepositoryImpl(MenuMapper menuMapper) {
		super();
		this.menuMapper = menuMapper;
	}

	@Override
	public void save(MenuDto menuDto) {
		menuMapper.save(menuDto);
	}

//	@Override
//	public List<Map<String, Object>> getMenuList() {
//		return menuMapper.findAll();
//	}

//	@Override
//	public List<Map<String, Object>> getMenuList(Map<String, String> ds_menu) {
//		return menuMapper.findAll(ds_menu);
//	}

	@Override
	public List<MenuDto> getMenuList(MenuDto menuDto) {
		return menuMapper.findAll(menuDto);
	}


	/*
	 * @Override public List<MenuDto> getMenuList() { return menuMapper.findAll(); }
	 */

	
	

}
