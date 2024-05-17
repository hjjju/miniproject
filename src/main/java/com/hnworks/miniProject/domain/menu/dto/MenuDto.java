package com.hnworks.miniProject.domain.menu.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MenuDto {

	private Long menuId;// 메뉴아이디 프라이머리키
	private Long parentId; // 부모아이디

	@JsonProperty("menuName")
	private String menuName;
	private int menuOrder; // 메뉴 순서
	private String menuUrl;
	private String useYn;

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getMenuOrder() {
		return menuOrder;
	}

	public void setMenuOrder(int menuOrder) {
		this.menuOrder = menuOrder;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	@Override
	public String toString() {
		return "MenuDto [menuId=" + menuId + ", parentId=" + parentId + ", menuName=" + menuName + ", menuOrder="
				+ menuOrder + ", menuUrl=" + menuUrl + ", useYn=" + useYn + "]";
	}

}
