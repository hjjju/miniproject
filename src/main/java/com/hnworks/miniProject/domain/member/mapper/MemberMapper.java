package com.hnworks.miniProject.domain.member.mapper;

import com.hnworks.miniProject.domain.member.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface MemberMapper {


    void save(HashMap<String, Object> paramMap);

    HashMap<String, Object> findById(HashMap<String, Object> paramMap);
}
