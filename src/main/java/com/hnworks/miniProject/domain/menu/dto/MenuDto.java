package com.hnworks.miniProject.domain.menu.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MenuDto {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;//메뉴아이디 프라이머리키
	private Long parentId; //부모아이디
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "PARENTID")
//	private MenuEntity parent;
	
	private String name;
	@JsonProperty
	private int menuOrder; //메뉴 순서
	@JsonProperty
	private String menuUrl;
	@JsonProperty
	private String useYn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	
	
}
