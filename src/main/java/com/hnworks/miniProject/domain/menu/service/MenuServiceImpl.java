package com.hnworks.miniProject.domain.menu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hnworks.miniProject.domain.member.respository.MemberRepository;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MenuServiceImpl implements MenuService{
	
	private final MemberRepository memberRepository;

	@Autowired
	public MenuServiceImpl(MemberRepository memberRepository) {
		super();
		this.memberRepository = memberRepository;
	}
	

}
