package com.hnworks.miniProject.domain.member.respository;

import com.hnworks.miniProject.domain.member.entity.MemberEntity;
import com.hnworks.miniProject.domain.member.mapper.MemberMapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class MemberRepositoryImpl implements MemberRepository{
    private final MemberMapper memberMapper;


    public MemberRepositoryImpl(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;

    }


    @Override
    public void save(HashMap<String, Object> paramMap) {
        memberMapper.save(paramMap);
    }

    @Override
    public HashMap<String, Object> getMemberById(HashMap<String, Object> paramMap) {
        return memberMapper.findById(paramMap);
    }


}
