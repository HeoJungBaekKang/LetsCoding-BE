package com.group.letscoding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    // 1. 스터디 그룹 생성 페이지로 이동
    @GetMapping("/member/create-group")
    public String createGroup () {
        return "member/create-group";
    }





}
