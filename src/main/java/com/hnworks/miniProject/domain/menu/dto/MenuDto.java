package com.hnworks.miniProject.domain.menu.dto;

import java.awt.Menu;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hnworks.miniProject.domain.menu.entity.MenuEntity;

import lombok.Builder;

public class MenuDto {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long menuId;//메뉴아이디 프라이머리키
	private Long parentId; //부모아이디
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "PARENTID")
//	private MenuEntity parent;
	@JsonProperty("menuName")
	private String menuName;
	@JsonProperty
	private int menuOrder; //메뉴 순서
	@JsonProperty
	private String menuUrl;
	@JsonProperty
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
