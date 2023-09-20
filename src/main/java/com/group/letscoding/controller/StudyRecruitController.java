package com.group.letscoding.controller;

import com.group.letscoding.dto.RecruitPostDTO;
import com.group.letscoding.service.RecruitBoardServiceImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudyRecruitController {
    private RecruitBoardServiceImpl recruitBoardService;

    public StudyRecruitController(RecruitBoardServiceImpl recruitBoardService) {
        this.recruitBoardService = recruitBoardService;
    }

    @GetMapping(value="/study/main")
    public String ListRecruit(Model model){
        //1. RecruitBoardService의 메소드를 통해
        // 게시글 목록 받아오기
        List<RecruitPostDTO> recruitBoardList = recruitBoardService.getRecruitBoardList();

        //2.모델 객체에 recruitBoardList를 담아 뷰 이동
        model.addAttribute("recruitBoardList",recruitBoardList);

        //3.View 이동
        return "studyrecruitboard-form";
    }

    @GetMapping(value="/study/")
    public String WriteRecruit(){
        //바로 게시글 작성 화면으로 이동
        return "~";
    }

    @GetMapping(value = "/study/search/{keyword}")
    public String StudyRecruitSearch(@RequestParam("keyword") String keyword, Model model){
        //1. 검색어를 사용하여 게시글 검색
        List<RecruitPostDTO> searchResults = recruitBoardService.findByTitleContaining(keyword);
        //2.Model 객체에 리스트 담기
        model.addAttribute("searchResults",searchResults);
        return "redirect:/study/main";
    }
}
