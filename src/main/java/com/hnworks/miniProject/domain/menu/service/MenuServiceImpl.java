package com.hnworks.miniProject.domain.menu.service;

import java.util.List;

import org.springframework.stereotype.Component;
import com.hnworks.miniProject.domain.menu.dto.MenuDto;
import com.hnworks.miniProject.domain.menu.repository.MenuRepository;
import com.nexacro.java.xapi.data.DataSet;
import com.nexacro.java.xapi.data.DataTypes;
import com.nexacro.java.xapi.data.PlatformData;
import com.nexacro.uiadapter.spring.core.data.NexacroResult;


@Component
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
	public NexacroResult getMenuList() {

		List<MenuDto> menuList = menuRepository.getMenuList();

		//menuList DataSet형식으로 변환해서 controller에 전달
		DataSet reDataSet = new DataSet("ds_menu");
		reDataSet.addColumn("MENU_ID", DataTypes.STRING,50);
		reDataSet.addColumn("MENU_NAME", DataTypes.STRING, 100);
		reDataSet.addColumn("PARENT_ID", DataTypes.STRING, 50);
		reDataSet.addColumn("MENU_ORDER", DataTypes.STRING, 100);
		reDataSet.addColumn("MENU_URL", DataTypes.STRING, 100);
		reDataSet.addColumn("USER_YN", DataTypes.STRING, 4);

		// PlatformData 생성
		PlatformData respdata  = new PlatformData();
		NexacroResult result = new NexacroResult();
		
		
		for (MenuDto menu : menuList) {
			
			//row추가하면서 row번호 리턴함
			int row = reDataSet.newRow();

			// 신규row에 데이터 추가
			reDataSet.set(row, "MENU_ID", menu.getMenuId());
			reDataSet.set(row, "MENU_NAME", menu.getMenuName());
			reDataSet.set(row, "PARENT_ID", menu.getParentId());
			reDataSet.set(row, "MENU_ORDER", menu.getMenuOrder());
			reDataSet.set(row, "MENU_URL", menu.getMenuUrl());
			reDataSet.set(row, "USER_YN", menu.getUseYn());
			
		}
		
		result.addDataSet(reDataSet);
		return result;
	}

}
