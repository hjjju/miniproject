package com.hnworks.miniProject.domain.menu.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nexacro.java.xapi.data.DataSet;
import com.nexacro.java.xapi.data.DataTypes;
import com.nexacro.java.xapi.data.datatype.DataType;

import lombok.Data;


@Data
public  class MenuDto {

	@JsonProperty("menu_id")
	private Long menuId;// 메뉴아이디 프라이머리키
	@JsonProperty("parent_id")
	private Long parentId; // 부모아이디
	@JsonProperty("menu_name")
	private String menuName;
	@JsonProperty("menu_order")
	private int menuOrder; // 메뉴 순서
	@JsonProperty("menu_url")
	private String menuUrl;
	@JsonProperty("use_yn")
	private String useYn;
	
	
	
	/* 
	* FUNCTION NAME : makeDtoDataSet
	* DESCRIPTION   : dto 필드값 dataSet으로 생성
	* PARAM 		    : param1 조회 객체1
	*			          : param2 조회 객체2 
	*/
	public static DataSet makeDtoDataSet(MenuDto menuDto) {
		
		DataSet dataSet = new DataSet();
		
		dataSet.addColumn("menu_id",DataTypes.BLOB);
		dataSet.addColumn("parent_id",DataTypes.STRING);
		dataSet.addColumn("menu_name",DataTypes.STRING);
		dataSet.addColumn("menu_order",DataTypes.STRING);
		dataSet.addColumn("menu_url",DataTypes.STRING);
		dataSet.addColumn("use_yn",DataTypes.INT);
		
		int row = dataSet.newRow();
		dataSet.set(row, "menu_id",menuDto.menuId);
		dataSet.set(row, "parent_id",menuDto.parentId);
		dataSet.set(row, "menu_name",menuDto.menuName);
		dataSet.set(row, "menu_order",menuDto.menuOrder);
		dataSet.set(row, "menu_url",menuDto.menuUrl);
		dataSet.set(row, "use_yn",menuDto.useYn);
		
		return dataSet;
	}
	
}
