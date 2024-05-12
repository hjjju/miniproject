package com.hnworks.miniProject.domain.member.respository;


import com.hnworks.miniProject.domain.member.entity.MemberEntity;

import java.util.HashMap;

public interface MemberRepository {
    void save(HashMap<String, Object> paramMap);

    HashMap<String, Object> getMemberById(HashMap<String, Object> paramMap);
}
