package com.hnworks.miniProject.domain.menu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hnworks.miniProject.domain.menu.mapper.MenuMapper;

@Component
public class MenuRepositoryImpl implements MenuRepository{
	
	private final MenuMapper menuMapper;

	@Autowired
	public MenuRepositoryImpl(MenuMapper menuMapper) {
		super();
		this.menuMapper = menuMapper;
	}
	
	

}
