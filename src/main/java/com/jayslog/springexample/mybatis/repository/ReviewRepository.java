package com.jayslog.springexample.mybatis.repository;

import com.jayslog.springexample.mybatis.entity.Review;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ReviewRepository {
    // new_review 테이블의 id가 14인 행 조회
    public Review selectReview(@Param("id") int id); // 한 행만 조회할거기에 Review 타입

    // review 테이블에 한 행을 저장하는 기능
    public int insertReview(
            @Param("storeId") int storeId
            ,@Param("menu") String menu
            ,@Param("userName") String userName
            ,@Param("point") double point
            ,@Param("review") String review
    );

    // Review 객체를 전달해서 new_review에 저장하는 기능
    public int insertReviewByObject(Review review);
}
