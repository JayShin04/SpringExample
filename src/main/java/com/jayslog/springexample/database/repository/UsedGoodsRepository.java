package com.jayslog.springexample.database.repository;

import com.jayslog.springexample.database.domain.UsedGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


// @Mapper 역할 : 서비스에서 usedgoods 테이블 모든 행 조회
@Mapper
public interface UsedGoodsRepository {

    // used_goods 테이블 모든 행 조회
    public List<UsedGoods> selectUsedGoodsList();

}
