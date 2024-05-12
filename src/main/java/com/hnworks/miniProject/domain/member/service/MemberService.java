package com.hnworks.miniProject.domain.member.service;

import com.hnworks.miniProject.domain.member.dto.MemberDto;

public interface MemberService {
    boolean joinMember(MemberDto memberDto);

    MemberDto getMemberById(String id);
}
