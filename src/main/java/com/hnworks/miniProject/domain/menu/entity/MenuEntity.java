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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENTID")
	private MenuEntity parent;
	
	private String name;
	
	private int menuOrder; //메뉴 순서
	
	
	@OneToMany(mappedBy = "parent")
	private List<MenuEntity> children = new ArrayList<>();
}
