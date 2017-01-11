package com.tops001.general;

import com.tops001.core.vo.Result;
import com.tops001.domain.general.result.TotalNumResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Administrator on 2016/8/22.
 */

@Path("/general")
@Api(tags = "综合数据处理", description = "通用数据接口")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface IGeneralService {
    @GET
    @Path("/getTotalNum")
    @Valid
    @ApiOperation(value = "获取公司、门店、经纪人总数", httpMethod = "GET")
    Result<TotalNumResult> getTotalNum();
}
