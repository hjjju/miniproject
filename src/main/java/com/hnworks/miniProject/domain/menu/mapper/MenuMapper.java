package com.hnworks.miniProject.domain.menu.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hnworks.miniProject.domain.menu.entity.MenuEntity;

@Mapper
public interface MenuMapper {

	void save(MenuEntity menuEntity);

}
