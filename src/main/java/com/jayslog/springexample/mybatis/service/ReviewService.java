package com.jayslog.springexample.mybatis.service;


import com.jayslog.springexample.mybatis.entity.Review;
import com.jayslog.springexample.mybatis.repository.ReviewRepository;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    // id가 14인 리뷰 정보 얻어오기
    public Review getReview(int id) {
        Review review = reviewRepository.selectReview(id);
        return review;
    }

}
