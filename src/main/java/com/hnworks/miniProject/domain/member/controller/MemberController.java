package com.hnworks.miniProject.domain.member.controller;

import com.hnworks.miniProject.domain.member.dto.MemberDto;
import com.hnworks.miniProject.domain.member.dto.ResponseDto;
import com.hnworks.miniProject.domain.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class MemberController {

    private final MemberService memberService;


    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/test")
    public String test() {
        log.info("test!!");
        return "test";
    }

    @PostMapping("/join")
    public ResponseDto joinMember(@RequestBody MemberDto memberDto) {
        log.info("/join...");

        boolean b = memberService.joinMember(memberDto);

        if (b == true) {
            ResponseDto responseDto = new ResponseDto();
            responseDto.setMessage("ok");
            return responseDto;
        }
        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage("fail");
        return responseDto;
    }

    @GetMapping("/member")
    public MemberDto getMember(@RequestParam("id") String id) {
        MemberDto res = memberService.getMemberById(id);
        return res;
    }
}
