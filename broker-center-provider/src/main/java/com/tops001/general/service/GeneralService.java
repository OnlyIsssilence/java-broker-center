package com.tops001.general.service;

import com.tops001.broker.dao.IBrokerMapper;
import com.tops001.company.dao.ICompanyMapper;
import com.tops001.core.vo.Result;
import com.tops001.domain.general.result.TotalNumResult;
import com.tops001.general.IGeneralService;
import com.tops001.shop.dao.IShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/8/22.
 */
@Service("generalService")
public class GeneralService implements IGeneralService {

    @Autowired
    private ICompanyMapper companyMapper;
    @Autowired
    private IShopMapper shopMapper;
    @Autowired
    private IBrokerMapper brokerMapper;

    @Override
    public Result<TotalNumResult> getTotalNum() {
        TotalNumResult totalNumResult = new TotalNumResult();
        totalNumResult.setCompanyNum(companyMapper.getCompanyCount(null));
        totalNumResult.setBrokerNum(brokerMapper.getBrokerCount(null));
        totalNumResult.setShopNum(shopMapper.getShopCount(null));

        return Result.createSuccess(totalNumResult);
    }
}
