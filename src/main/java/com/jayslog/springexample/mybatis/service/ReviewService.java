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


    // 리뷰 정보를 전달 받고, 리뷰를 추가하는 기능
    public int createReview(
            int storeId
            , String menu
            , String userName
            , double point
            , String review
    ) {
        // review 테이블에 한행을 저장하는 기능
        int count = reviewRepository.insertReview(storeId, menu, userName, point, review);
        return count;
    }
}
