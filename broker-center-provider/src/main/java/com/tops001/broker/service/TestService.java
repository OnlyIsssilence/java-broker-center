package com.tops001.broker.service;

import com.tops001.broker.ITestService;
import com.tops001.broker.entity.Test;
import com.tops001.core.utils.BeanUtils;
import com.tops001.core.vo.Result;
import com.tops001.domain.broker.result.TestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tops001.broker.dao.ITestMapper;


/**
 * Created by Administrator on 2016/7/26.
 */
@Service("testService")
public class TestService implements ITestService {
    @Autowired
    private ITestMapper testMapper;

    @Override
    public Result<TestResult> getTest(String brokerId) {
        Test testEntity = testMapper.findById(Long.valueOf(brokerId));
        TestResult result = new TestResult();
        if(result != null){
            BeanUtils.copyProperties(testEntity, result);
        }
        return Result.createSuccess("测试成功", result);
    }
}
