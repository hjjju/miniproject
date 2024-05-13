package com.hnworks.miniProject.domain.menu.dto;

import java.util.ArrayList;
import java.util.List;

import com.hnworks.miniProject.domain.menu.entity.MenuEntity;

import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


public class MenuDto {
	
	/*
	 * // @Id // @GeneratedValue(strategy = GenerationType.IDENTITY) private Long
	 * id;//메뉴아이디 프라이머리키
	 * 
	 * // @ManyToOne(fetch = FetchType.LAZY) // @JoinColumn(name = "PARENTID")
	 * private MenuEntity parent;
	 * 
	 * private String name;
	 * 
	 * private int menuOrder; //메뉴 순서
	 * 
	 * 
	 * // @OneToMany(mappedBy = "parent") private List<MenuDto> children = new
	 * ArrayList<>();
	 * 
	 * 
	 * public Long getId() { return id; }
	 * 
	 * 
	 * public void setId(Long id) { this.id = id; }
	 * 
	 * 
	 * public MenuEntity getParent() { return parent; }
	 * 
	 * 
	 * public void setParent(MenuEntity parent) { this.parent = parent; }
	 * 
	 * 
	 * public String getName() { return name; }
	 * 
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * 
	 * public int getMenuOrder() { return menuOrder; }
	 * 
	 * 
	 * public void setMenuOrder(int menuOrder) { this.menuOrder = menuOrder; }
	 * 
	 * 
	 * public List<MenuDto> getChildren() { return children; }
	 * 
	 * 
	 * public void setChildren(List<MenuDto> children) { this.children = children; }
	 * 
	 */

}
