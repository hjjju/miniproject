package com.hnworks.miniProject.domain.menu.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hnworks.miniProject.domain.menu.dto.MenuDto;

public interface MenuRepository {

	void save(MenuDto menuDto);

	List<MenuDto> getMenuList();

}
