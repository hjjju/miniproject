package com.hnworks.miniProject.domain.menu.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hnworks.miniProject.domain.menu.dto.MenuDto;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="TBMENU")
public class MenuEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long menuId;//메뉴아이디 프라이머리키
	
	private Long parentId; //부모아이디
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "PARENTID")
//	private MenuEntity parent;
	@JsonProperty("menuName")
	private String menuName;
	
	private int menuOrder; //메뉴 순서
	
	private String menuUrl;
	
	private String useYn;

	
	public Long getMenuId() {
		return menuId;
	}

	public Long getParentId() {
		return parentId;
	}

	public String getMenuName() {
		return menuName;
	}

	public int getMenuOrder() {
		return menuOrder;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public String getUseYn() {
		return useYn;
	}
	
	//연관관계 편의 메소드
	public void addMenuEntity(Long menuId, Long parentId, String menuName, int menuOrder, String menuUrl, String useYn) {
		this.menuId = menuId;
		this.parentId = parentId;
		this.menuName = menuName;
		this.menuOrder = menuOrder;
		this.menuUrl = menuUrl;
		this.useYn = useYn;
		
	}
	
	
	
}
