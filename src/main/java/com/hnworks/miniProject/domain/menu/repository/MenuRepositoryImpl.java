package com.hnworks.miniProject.domain.menu.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hnworks.miniProject.domain.menu.dto.MenuDto;
import com.hnworks.miniProject.domain.menu.mapper.MenuMapper;

import lombok.AllArgsConstructor;

@Component
public class MenuRepositoryImpl implements MenuRepository {

	final private MenuMapper menuMapper;
	
	public MenuRepositoryImpl(MenuMapper menuMapper) {
		super();
		this.menuMapper = menuMapper;
	}

	@Override
	public void save(MenuDto menuDto) {
		menuMapper.save(menuDto);
	}

	@Override
	public List<MenuDto> getMenuList() {
		return menuMapper.findAll();
	}

}
