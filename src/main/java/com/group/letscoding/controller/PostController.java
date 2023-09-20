package com.group.letscoding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    // 1. 모집 글 작성 페이지로 이동
    @GetMapping("/post/create-post")
    public String createPost () {
        return "post/create-post";
    }

    // 2. 모집 글 상세보기 페이지로 이동
    @GetMapping("/post/study-recruitment/{recruitmentId}")
    public String recruitment (){
        return "post/study-recruitment";
    }

    // 3. 모집 글 수정 화면으로 이동 -> updatePost.html
    @GetMapping("/post/update-post")
    public String updatePost () {
        return "update-post";
    }

    // 4. 스터디 그룹 생성 화면 -> createGroup.html
    @GetMapping("/post/create-group")
    public String createGroup () {
        return "member/create-group";
    }
}
