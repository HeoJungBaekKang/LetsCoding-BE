package com.group.letscoding.service;

import com.group.letscoding.domain.review.Review;
import com.group.letscoding.domain.review.ReviewRepository;
import com.group.letscoding.dto.review.ReviewDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ReviewService {
    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<ReviewDto> reviewList(String userId, String title, String content) {
        List<Review> reviews;
        try {
//            reviews = this.reviewRepository.findBy
        } catch (NoSuchElementException e) {

        }
    }
}
