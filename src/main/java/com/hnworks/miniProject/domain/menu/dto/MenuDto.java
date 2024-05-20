package com.hnworks.miniProject.domain.menu.dto;


import lombok.Data;

@Data
public class MenuDto {

	private Long menuId;// 메뉴아이디 프라이머리키
	private Long parentId; // 부모아이디
	private String menuName;
	private int menuOrder; // 메뉴 순서
	private String menuUrl;
	private String useYn;

	

}
