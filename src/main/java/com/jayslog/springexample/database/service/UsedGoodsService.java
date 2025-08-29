package com.jayslog.springexample.database.service;


import com.jayslog.springexample.database.domain.UsedGoods;
import com.jayslog.springexample.database.repository.UsedGoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// @Service 역할 : 부가적인 기능을 수행
// @Controller에서 필요한 기능을 수행
@Service
public class UsedGoodsService {


    // 의존성 주입 - DI (Dependency Injection)
    // 직접 생성하지 않고 스프링 프레임워크에 맡긴디ㅏ.
    @Autowired
    private UsedGoodsRepository usedGoodsRepository;



    // 중고 거래 게시글 정보를 얻어오는 기능
    public List<UsedGoods> getUsedGoodsList() {
        // 스프링은 객체를 직접 생성해서 사용하는ㄴ 것을 지양한다.

        // used_goods 테이블 모든 행 조회
        List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsedGoodsList();
        return usedGoodsList;
    }

}
