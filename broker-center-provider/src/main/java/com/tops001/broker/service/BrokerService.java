package com.tops001.broker.service;

import com.tops001.broker.IBrokerService;
import com.tops001.broker.dao.IBrokerMapper;
import com.tops001.broker.entity.Broker;
import com.tops001.common.BeanListUtils;
import com.tops001.core.utils.BeanUtils;
import com.tops001.core.vo.PageCondition;
import com.tops001.core.vo.Result;
import com.tops001.domain.PageResult;
import com.tops001.domain.broker.parameters.BrokerParameter;
import com.tops001.domain.broker.parameters.BrokerTopParameter;
import com.tops001.domain.broker.result.BrokerDetailResult;
import com.tops001.domain.broker.result.BrokerResult;
import com.tops001.domain.broker.result.BrokerTopResult;
import com.tops001.domain.shop.result.BrokerTopShopResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.BeanParam;
import java.util.ArrayList;
import java.util.List;

/**
 * Author:zhangmingqiang on 2016/8/10.
 * Date  :2016/8/10.
 * Description:
 */

@Service("brokerService")
public class BrokerService implements IBrokerService {

    @Autowired
    private IBrokerMapper brokerMapper;


    @Override
    public Result<PageResult<List<BrokerResult>>> getBrokerListByCity(BrokerParameter brokerParameter) {

        List<Broker> brokerList =  brokerMapper.findBrokerList(brokerParameter);

        Long totalCount = brokerMapper.getBrokerCount(brokerParameter);
        List<BrokerResult> result = new ArrayList<>();
        if(brokerList != null){
            BeanListUtils.copyProperties(brokerList, result, BrokerResult.class);
        }
        PageResult<List<BrokerResult>> pageResult = new PageResult<>(result, totalCount);
        return Result.createSuccess(pageResult);
    }

    @Override
    public Result<List<BrokerTopResult>> getTopBrokerList(@BeanParam BrokerTopParameter brokerTopParameter) {
        brokerTopParameter.setPageSize(Integer.valueOf(10));
        List<Broker> brokerList = brokerMapper.findTopTenBrokerList(brokerTopParameter);

        List<BrokerTopResult> result = new ArrayList<>();

        if (brokerList != null) {
            BeanListUtils.copyProperties(brokerList, result, BrokerTopResult.class);
        }else{
            return Result.createUnknowFail(2, "公司不存在");
        }
        return Result.createSuccess(result);
    }

    @Override
    public Result<BrokerDetailResult> getBrokerDetail(Integer brokerId) {
        Broker broker = brokerMapper.findBrokerByBrokerId(brokerId);
        BrokerDetailResult brokerDetailResult = new BrokerDetailResult();

        if (broker != null){
            BeanUtils.copyProperties(broker,brokerDetailResult);
        }else {
            return Result.createUnknowFail(2,"经纪人不存在");
        }
        return Result.createSuccess(brokerDetailResult);
    }
}
