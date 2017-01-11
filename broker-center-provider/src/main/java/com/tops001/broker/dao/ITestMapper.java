package com.tops001.broker.dao;

import com.tops001.broker.entity.Test;

/**
 * Created by Administrator on 2016/7/26.
 */
public interface ITestMapper {
    int deleteById(Long brokerId);

    Test findById(Long brokerId);

    //int insert(Broker record);

    //int insertSelective(Broker record);
}
