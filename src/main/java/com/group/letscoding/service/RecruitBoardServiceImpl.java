package com.group.letscoding.service;

import com.group.letscoding.Domain.StudyPost.StudyPostRepository;
import com.group.letscoding.dto.RecruitPostDTO;

import java.util.List;

public class RecruitBoardServiceImpl implements RecruitBoardService{

    private final StudyPostRepository studyPostRepository;

    public RecruitBoardServiceImpl(StudyPostRepository studyPostRepository) {
        this.studyPostRepository = studyPostRepository;
    }

    @Override
    public List<RecruitPostDTO> getRecruitBoardList() {
        return studyPostRepository.findIdAndTitleAndStack();
    }

    @Override
    public List<RecruitPostDTO> findByTitleContaining(String keyword) {
        return studyPostRepository.findByTitleContaining(keyword);
    }

}
