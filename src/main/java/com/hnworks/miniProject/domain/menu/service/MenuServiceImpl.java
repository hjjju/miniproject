package com.hnworks.miniProject.domain.menu.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hnworks.miniProject.domain.menu.dto.MenuDto;
import com.hnworks.miniProject.domain.menu.repository.MenuRepository;

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
		return true;
	}

	@Override
	public List<MenuDto> getMenuList() {

		// entity ->dto변경 // List<MenuDto> menuList =
//	  menuRepository.getMenuList().stream().map(MenuDto::of).collect(Collectors.toList()); 
		List<MenuDto> menuList = menuRepository.getMenuList();

		return menuList;
	}

}
