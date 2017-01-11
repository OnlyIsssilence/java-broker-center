package com.tops001.shop.service;

import com.tops001.common.BeanListUtils;
import com.tops001.core.utils.BeanUtils;
import com.tops001.core.vo.Result;
import com.tops001.domain.PageResult;
import com.tops001.domain.shop.parameters.BrokerShopParameter;
import com.tops001.domain.shop.parameters.BrokerTopShopParameter;
import com.tops001.domain.shop.result.BrokerShopDetailResult;
import com.tops001.domain.shop.result.BrokerShopResult;
import com.tops001.domain.shop.result.BrokerTopShopResult;
import com.tops001.shop.IBrokerShopService;
import com.tops001.shop.dao.IShopMapper;
import com.tops001.shop.entity.BrokerShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.BeanParam;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/5.
 */
@Service("brokerShopService")
public class BrokerShopService implements IBrokerShopService {

    @Autowired
    private IShopMapper shopMapper;

    @Override
    public Result<PageResult<List<BrokerShopResult>>> getShopList(@BeanParam BrokerShopParameter brokerShopParameter) {

        List<BrokerShop> shopList = shopMapper.findShopList(brokerShopParameter);
        Long totalCount = shopMapper.getShopCount(brokerShopParameter);
        List<BrokerShopResult> result = new ArrayList<>();
        if(shopList != null){
            BeanListUtils.copyProperties(shopList, result, BrokerShopResult.class);
        }
        PageResult<List<BrokerShopResult>> pageResult = new PageResult<>(result, totalCount);
        return Result.createSuccess(pageResult);
    }

    @Override
    public Result<List<BrokerTopShopResult>> getTopShopList(BrokerTopShopParameter brokerTopShopParameter) {

        brokerTopShopParameter.setPageSize(Integer.valueOf(10));
        List<BrokerShop> shopList = shopMapper.findTopShopList(brokerTopShopParameter);

        List<BrokerTopShopResult> result = new ArrayList<>();

        if (shopList != null) {
            BeanListUtils.copyProperties(shopList, result, BrokerTopShopResult.class);
        }else{
            return Result.createUnknowFail(2, "公司不存在");
        }
        return Result.createSuccess(result);
    }

    @Override
    public Result<BrokerShopDetailResult> getShopDetail(Integer shopId) {
        BrokerShopDetailResult brokerShopDetailResult = new BrokerShopDetailResult();
        BrokerShop brokerShop = shopMapper.findShopByShopId(shopId);
        if (brokerShop != null){
            BeanUtils.copyProperties(brokerShop,brokerShopDetailResult);
        }else {
            return Result.createUnknowFail(2,"门店不存在");
        }

        return Result.createSuccess("获取经纪公司详情",brokerShopDetailResult);
    }
}
