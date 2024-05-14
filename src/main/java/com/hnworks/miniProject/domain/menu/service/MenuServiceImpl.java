package com.hnworks.miniProject.domain.menu.service;

import java.util.HashMap;

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
public class MenuServiceImpl implements MenuService{
	
	private final MenuRepository menuRepository;

	

	public MenuServiceImpl(MenuRepository menuRepository) {
		super();
		this.menuRepository = menuRepository;
	}



	@Override
	public boolean saveMenu(MenuDto menuDto) {
		MenuEntity menuEntity = new MenuEntity();
		menuEntity.addMenuEntity(menuDto.getId(), menuDto.getParentId(), menuDto.getName(), menuDto.getMenuOrder(),menuDto.getMenuUrl(), menuDto.getUseYn());
		
		menuRepository.save(menuEntity);
		log.info("service");
		
		return true;
	}
	

}
