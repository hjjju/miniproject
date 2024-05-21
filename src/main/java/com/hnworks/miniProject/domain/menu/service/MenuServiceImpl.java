package com.hnworks.miniProject.domain.menu.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.hnworks.miniProject.domain.menu.dto.MenuDto;
import com.hnworks.miniProject.domain.menu.repository.MenuRepository;
import com.nexacro.uiadapter.spring.core.data.NexacroResult;

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

		List<MenuDto> menuList = menuRepository.getMenuList();

		//menuList DataSet형식으로 변환해서 controller에 전달
		
		NexacroResult result = new NexacroResult();
		
		for (MenuDto menuDto : menuList) {
			result.addDataSet(menuDto.makeDtoDataSet(menuDto));
		}
		
		
		
		return menuList;
	}




}
