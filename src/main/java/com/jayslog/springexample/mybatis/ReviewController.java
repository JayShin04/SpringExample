package com.jayslog.springexample.mybatis;


import com.jayslog.springexample.mybatis.entity.Review;
import com.jayslog.springexample.mybatis.service.ReviewService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/mybatis/review")
@Controller
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    // id가 14인 리뷰 정보를 response에 json으로 담는 페이지
    @RequestMapping("")
    @ResponseBody
    public Review review(@RequestParam("id") int id) {
        // Controller이니 요청과 응답만 생각한다.
        // id가 14인 리뷰 정보 얻어오기
        Review review = reviewService.getReview(id);
        return review;
    }

    // 하나의 리뷰를 작성하는
    @ResponseBody
    @RequestMapping("/write")
    public String writeReview() {
        // 4, 치즈피자, test, 4.5 , 치즈피자 존맛
//        int count = reviewService.createReview(4, "치즈피자", "test", 4.5, "치즈피자 존맛");
//        return "실행결과 : " + count;

        // 2, 뿌링클, test2, 4.0, 역시 뿌링클은 진리!
        Review review = new Review();
        review.setStoreId(2);
        review.setMenu("뿌링클");
        review.setUserName("test2");
        review.setPoint(4.0);
        review.setReview("역시 뿌링클은 진리!");

        int count = reviewService.createReviewByObject(review);
        return "실행 결과 : " + count;
    }
}
