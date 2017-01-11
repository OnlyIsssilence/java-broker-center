package com.tops001.company;

import com.tops001.core.vo.Result;
import com.tops001.domain.PageResult;
import com.tops001.domain.company.parameters.BrokerCompanyParameter;
import com.tops001.domain.company.parameters.BrokerTopCompanyParameter;
import com.tops001.domain.company.result.BrokerCompanyDetailResult;
import com.tops001.domain.company.result.BrokerCompanyResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Administrator on 2016/8/1.
 */
@Path("/company")
@Api(tags = "经纪公司", description = "经纪公司接口")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface IBrokerCompanyService {

    @GET
    @Path("/getCompanyList")
    @Valid
    @ApiOperation(value = "获取经纪公司列表", httpMethod = "GET")
    Result<PageResult<List<BrokerCompanyResult>>> getCompanyListByCity(@BeanParam BrokerCompanyParameter brokerCompanyParameter);

    @GET
    @Path("/getTopCompanyList")
    @Valid
    @ApiOperation(value = "获取Top10经纪公司列表", httpMethod = "GET")
    Result<List<BrokerCompanyResult>> getTopCompanyList(@BeanParam BrokerTopCompanyParameter brokerTopCompanyParameter);

    @GET
    @Path("/getCompanyDetail/{companyId}")
    @Valid
    @ApiOperation(value = "获取经纪公司详情", httpMethod = "GET")
    Result<BrokerCompanyDetailResult> getCompanyDetail(@ApiParam(value = "经纪公司ID", required = true)
                                        @PathParam("companyId")Integer companyId);
}
