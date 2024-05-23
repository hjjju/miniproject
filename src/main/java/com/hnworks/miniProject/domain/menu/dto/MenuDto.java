package com.hnworks.miniProject.domain.menu.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


@Data
public  class MenuDto {

	@JsonProperty("menu_id")
	private String menuId;// 메뉴아이디 프라이머리키
	
	@JsonIgnore 
	@JsonProperty("parent_id")
	private String parentId; // 부모아이디
	
	@JsonProperty("menu_name")
	private String menuName;
	
	@JsonProperty("menu_order")
	private String menuOrder; // 메뉴 순서
	
	@JsonProperty("menu_url")
	private String menuUrl;
	
	@JsonProperty("use_yn")
	private String useYn;
	
	
}
