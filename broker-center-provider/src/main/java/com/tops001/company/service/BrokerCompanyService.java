package com.tops001.company.service;

import com.tops001.common.BeanListUtils;
import com.tops001.company.IBrokerCompanyService;
import com.tops001.company.dao.ICompanyMapper;
import com.tops001.company.entity.BrokerCompany;
import com.tops001.core.utils.BeanUtils;
import com.tops001.core.vo.Result;
import com.tops001.domain.PageResult;
import com.tops001.domain.company.parameters.BrokerCompanyParameter;
import com.tops001.domain.company.parameters.BrokerTopCompanyParameter;
import com.tops001.domain.company.result.BrokerCompanyDetailResult;
import com.tops001.domain.company.result.BrokerCompanyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/2.
 */
@Service("brokerCompanyService")
public class BrokerCompanyService implements IBrokerCompanyService {

    @Autowired
    private ICompanyMapper companyMapper;

    @Override
    public Result<PageResult<List<BrokerCompanyResult>>> getCompanyListByCity(BrokerCompanyParameter brokerCompanyParameter) {
        List<BrokerCompany> companyList = companyMapper.findCompanyList(brokerCompanyParameter);
        Long totalCount = companyMapper.getCompanyCount(brokerCompanyParameter);
        List<BrokerCompanyResult> result = new ArrayList<>();
        if(companyList != null){
            BeanListUtils.copyProperties(companyList, result, BrokerCompanyResult.class);
        }
        PageResult<List<BrokerCompanyResult>> pageResult = new PageResult<>(result, totalCount);
        return Result.createSuccess(pageResult);
    }

    @Override
    public Result<List<BrokerCompanyResult>> getTopCompanyList(BrokerTopCompanyParameter brokerTopCompanyParameter) {
        brokerTopCompanyParameter.setPageSize(Integer.valueOf(10));
        List<BrokerCompany> companyList = companyMapper.findTopTenCompanyList(brokerTopCompanyParameter);
        List<BrokerCompanyResult> result = new ArrayList<>();
        if (companyList != null) {
            BeanListUtils.copyProperties(companyList, result, BrokerCompanyResult.class);
        }else{
            return Result.createUnknowFail(2, "公司不存在");
        }
        return Result.createSuccess(result);
    }

    @Override
    public Result<BrokerCompanyDetailResult> getCompanyDetail(Integer companyId) {

        BrokerCompanyDetailResult brokerCompanyDetailResult = new BrokerCompanyDetailResult();
        BrokerCompany brokerCompany = companyMapper.findCompanyByCompanyId(companyId);
        if (brokerCompany != null){
            BeanUtils.copyProperties(brokerCompany,brokerCompanyDetailResult);
        }else {
            return Result.createUnknowFail(2,"公司不存在");
        }

        return Result.createSuccess("获取经纪公司详情",brokerCompanyDetailResult);
    }
}
