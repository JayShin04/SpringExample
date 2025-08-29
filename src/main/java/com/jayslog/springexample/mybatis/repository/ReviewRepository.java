package com.jayslog.springexample.mybatis.repository;

import com.jayslog.springexample.mybatis.entity.Review;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ReviewRepository {
    // new_review 테이블의 id가 14인 행 조회
    public Review selectReview(@Param("id") int id); // 한 행만 조회할거기에 Review 타입
}
