package com.tops001.shop.dao;


import com.tops001.domain.shop.parameters.BrokerShopParameter;
import com.tops001.domain.shop.parameters.BrokerTopShopParameter;
import com.tops001.shop.entity.BrokerShop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2016/8/5.
 */
public interface IShopMapper {

    /**
     * 查询经纪门店TOP列表。
     * @param brokerTopShopParameter
     * @return
     */
    List<BrokerShop> findTopShopList(BrokerTopShopParameter brokerTopShopParameter);

    /**
     * 获取经纪公司总数
     * @param brokerShopParameter
     * @return
     */
    Long getShopCount(@Param("param") BrokerShopParameter brokerShopParameter);

    /**
     * 查询经纪公司门店(不排名)
     * @param brokerShopParameter
     * @return
     */
    List<BrokerShop> findShopList(BrokerShopParameter brokerShopParameter);

    /**
     * 根据公司ID查找公司的详情
     * @param shopId
     * @return
     */
    BrokerShop findShopByShopId(Integer shopId);
}
