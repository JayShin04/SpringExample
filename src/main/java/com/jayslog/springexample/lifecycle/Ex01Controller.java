package com.jayslog.springexample.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Ex01Controller {
    //html 을 응답에 담는 페이지

    @ResponseBody
    @RequestMapping("/lifecycle/ex01/1")
    public String htmlResponse() {
        return "<html>" +
                "   <head><title>Spring</title></head>" +
                "   <body>" +
                "       <h2>Spring html response</h2>" +
                "   </body>" +
                "</html>";
    }

    // 맵을 response에 담은 페이지
    @ResponseBody
    @RequestMapping("/lifecycle/ex01/2")
    public Map<String, Integer> mapResponse() {
        // 과일 이름 : 가격
        Map<String, Integer> fruitMap = new HashMap<>();

        fruitMap.put("apple", 1500);
        fruitMap.put("banana", 4500);
        fruitMap.put("orange", 1300);

        return fruitMap;
    }
}
