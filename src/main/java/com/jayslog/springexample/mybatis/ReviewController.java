package com.jayslog.springexample.mybatis;


import com.jayslog.springexample.mybatis.entity.Review;
import com.jayslog.springexample.mybatis.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    // id가 14인 리뷰 정보를 response에 json으로 담는 페이지
    @RequestMapping("/mybatis/review")
    @ResponseBody
    public Review review() {
        // Controller이니 요청과 응답만 생각한다.
        // id가 14인 리뷰 정보 얻어오기
        Review review = reviewService.getReview(2);
        return review;

    }
}
