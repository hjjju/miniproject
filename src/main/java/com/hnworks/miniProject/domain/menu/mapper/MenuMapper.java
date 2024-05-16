package com.hnworks.miniProject.domain.menu.mapper;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.hnworks.miniProject.domain.menu.dto.MenuDto;
import com.hnworks.miniProject.domain.menu.entity.MenuEntity;

@Mapper
public interface MenuMapper {

	void save(MenuDto menuDto);

//	List<Map<String, Object>> findAll();

//	List<Map<String, Object>> findAll(Map<String, String> ds_menu);

	List<MenuDto> findAll(MenuDto menuDto);

//	List<MenuDto> findAll();


}
