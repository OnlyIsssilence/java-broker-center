package com.tops001.broker.service;

import com.tops001.common.RedisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Administrator on 2016/7/26.
 */
@Service("quartzJobService")
public class QuartzJobService {
    public static final Logger LOGGER = LoggerFactory.getLogger(QuartzJobService.class);

    @Autowired
    private RedisUtils redisUtils;

    /**
     * 每分钟第59秒执行，超时订单处理操作
     */
    public void executeOvertimeOrder() {
        LOGGER.info("executeOvertimeOrder start..." + new Date());
//        SimpleDateFormat sf = new SimpleDateFormat("HHmm");
//        String redisKey = sf.format(new Date()) + "_*";
//        Set<String> keys = redisUtils.SetKeys(redisKey);
//        redisUtils.delete(keys);
//        StringBuffer orderIdRecord = new StringBuffer("[");
//        for (String str : keys) {
//            String _orderId = str.split("_")[1];
//            Long orderId = Long.parseLong(_orderId);
//            kberOrderService.doOvertimeOrder(orderId);
//            orderIdRecord.append(str).append(",");
//        }
//        orderIdRecord.append("]");
//        LOGGER.info("executeOvertimeOrder end...execute orderIds:" + orderIdRecord.toString());
    }
}

