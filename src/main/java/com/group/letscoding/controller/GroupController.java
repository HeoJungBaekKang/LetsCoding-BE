package com.group.letscoding.controller;

import com.group.letscoding.dto.review.ReviewDto;
import com.group.letscoding.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GroupController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping(value={"/group", "/group/list"})
    public ModelAndView groupForm(String userId, String title, String content, String groupNam, ModelAndView mav) {
        mav.setViewName("group");
        List<ReviewDto> reviews = this.reviewService.reviewList(userId, title, content);
        mav.addObject("reviews", reviews);
        return mav;
    }

    @GetMapping("/group/review")
    public String reviewForm() {
        return "group/review-form";
    }

    @GetMapping("/group/review-detail")
    public String reviewDetail() {
        return "group/review-detail";
    }

    @GetMapping("/group/review-edit")
    public String reviewEdit() {
        return "group/review-edit";
    }

    @GetMapping("/user/my-page")
    public String myPageForm() {
        return "user/my-page";
    }
}
