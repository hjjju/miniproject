package com.hnworks.miniProject.domain.menu.service;

import com.hnworks.miniProject.domain.menu.dto.MenuDto;
import com.nexacro.java.xapi.data.DataSet;
import com.nexacro.uiadapter.spring.core.data.NexacroResult;

public interface MenuService {

	public boolean saveMenu(MenuDto menuDto);

	public NexacroResult getMenuList();
	

}
