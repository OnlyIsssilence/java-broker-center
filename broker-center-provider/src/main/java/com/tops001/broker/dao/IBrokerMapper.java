package com.tops001.broker.dao;

import com.tops001.broker.entity.Broker;
import com.tops001.domain.broker.parameters.BrokerParameter;
import com.tops001.domain.broker.parameters.BrokerTopParameter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author:zhangmingqiang on 2016/8/10.
 * Date  :2016/8/10.
 * Description:
 */
public interface IBrokerMapper {
    /**
     * 查询经纪人列表。
     * @param brokerParameter
     * @return
     */
    List<Broker> findBrokerList(BrokerParameter brokerParameter);

    /**
     * 获取经纪人总数
     * @param brokerParameter
     * @return
     */
    Long getBrokerCount(@Param("param") BrokerParameter brokerParameter);

    /**
     * 获取排名前十的经纪人
     * @param brokerTopParameter
     * @return
     */
    List<Broker> findTopTenBrokerList(BrokerTopParameter brokerTopParameter);

    /**
     * 按照经纪人ID查找公司信息
     *
     * @param brokerId
     * @return
     */
    Broker findBrokerByBrokerId(Integer brokerId);

}
