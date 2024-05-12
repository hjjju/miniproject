package com.hnworks.miniProject.domain.member.service;

import com.hnworks.miniProject.domain.member.dto.MemberDto;
import com.hnworks.miniProject.domain.member.entity.MemberEntity;
import com.hnworks.miniProject.domain.member.respository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Slf4j
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public boolean joinMember(MemberDto memberDto) {
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("id", memberDto.getId());
        paramMap.put("name", memberDto.getName());

        memberRepository.save(paramMap);

        log.info("service...");

        return true;
    }

    @Override
    public MemberDto getMemberById(String id) {

        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("id", id);

        HashMap<String,Object> res = memberRepository.getMemberById(paramMap);

        MemberDto memberDto = new MemberDto();

        memberDto.setId((String) res.get("ID")); //TABLE컬럼명과 일치해야함!!!
        memberDto.setName((String) res.get("NAME"));


        return memberDto;
    }
}
