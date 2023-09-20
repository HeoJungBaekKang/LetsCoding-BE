package com.group.letscoding.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//게시글 관련
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecruitPostDTO {

    //게시글 일련번호,기본키
    private String username;

    //제목
    private String title;

    //기술 스택 - 스터디 그룹 엔티티,테이블과 매팡 팔요
    private String stack;

    //Getter,Setters...
    //Constructors,toStrings...
}
