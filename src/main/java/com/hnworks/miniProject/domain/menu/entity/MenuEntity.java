package com.hnworks.miniProject.domain.menu.entity;

import java.util.ArrayList;
import java.util.List;

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
	private Long id;//메뉴아이디 프라이머리키
	
	private Long parentId; //부모아이디
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "PARENTID")
//	private MenuEntity parent;
	
	private String name;
	
	private int menuOrder; //메뉴 순서
	
	private String menuUrl;
	
	private String useYn;

	public Long getId() {
		return id;
	}

	public Long getParentId() {
		return parentId;
	}

	public String getName() {
		return name;
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
	public void addMenuEntity(Long id, Long parentId, String name, int menuOrder, String menuUrl, String useYn) {
		this.id = id;
		this.parentId = parentId;
		this.name = name;
		this.menuOrder = menuOrder;
		this.menuUrl = menuUrl;
		this.useYn = useYn;
		
	}
	
	
	
}
