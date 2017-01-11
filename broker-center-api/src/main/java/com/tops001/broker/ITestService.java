package com.tops001.broker;

import com.tops001.core.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.tops001.domain.broker.result.TestResult;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Administrator on 2016/7/26.
 */
@Path("/test")
@Api(tags = "测试2", description = "测试相关接口")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface ITestService {
    /**
     * 根据用户id获取经纪人信息
     *
     * @param brokerId
     * @return
     */
    @GET
    @Path("/getTest/{brokerId}")
    @Valid
    @NotNull
    @ApiOperation(value = "test", httpMethod = "GET")
    Result<TestResult> getTest(@Pattern(regexp = "\\d+") @PathParam("brokerId")String brokerId);
}
