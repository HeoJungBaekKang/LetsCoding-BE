package com.group.letscoding.Domain.StudyPost;

import com.group.letscoding.dto.RecruitPostDTO;
import com.group.letscoding.Domain.StudyPost.StudyPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudyPostRepository extends JpaRepository<StudyPost,Integer> {

    List<RecruitPostDTO> findIdAndTitleAndStack();

    List<RecruitPostDTO> findByTitleContaining(String keyword);
}
