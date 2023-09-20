package com.group.letscoding.service;

import com.group.letscoding.dto.RecruitPostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
interface RecruitBoardService {

    //게시판 게시물 가져오기
    List<RecruitPostDTO> getRecruitBoardList();

    //검색
    List<RecruitPostDTO> findByTitleContaining(String keyword);


}
