package com.hnworks.miniProject.domain.menu.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hnworks.miniProject.domain.menu.dto.MenuDto;

@Mapper
public interface MenuMapper {

	void save(MenuDto menuDto);

	List<MenuDto> findAll();


}
