package com.tops001.company.dao;

import com.tops001.company.entity.BrokerCompany;
import com.tops001.domain.company.parameters.BrokerCompanyParameter;
import com.tops001.domain.company.parameters.BrokerTopCompanyParameter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2016/8/3.
 */
public interface ICompanyMapper {

    /**
     * 查询经纪公司列表。
     * @param brokerCompanyParameter
     * @return
     */
    List<BrokerCompany> findCompanyList(BrokerCompanyParameter brokerCompanyParameter);

    /**
     * 获取经纪公司总数
     * @param brokerCompanyParameter
     * @return
     */
    Long getCompanyCount(@Param("param") BrokerCompanyParameter brokerCompanyParameter);

    /**
     * 获取排名前十的公司
     * @param brokerTopCompanyParameter
     * @return
     */
    List<BrokerCompany> findTopTenCompanyList(BrokerTopCompanyParameter brokerTopCompanyParameter);

    /**
     * 按照公司ID查找公司信息
     * @param companyId
     * @return
     */
    BrokerCompany findCompanyByCompanyId(Integer companyId);
}
