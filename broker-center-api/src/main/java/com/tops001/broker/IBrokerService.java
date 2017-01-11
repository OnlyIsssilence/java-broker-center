package com.tops001.broker;

import com.tops001.core.vo.Result;
import com.tops001.domain.PageResult;
import com.tops001.domain.broker.parameters.BrokerParameter;
import com.tops001.domain.broker.parameters.BrokerTopParameter;
import com.tops001.domain.broker.result.BrokerDetailResult;
import com.tops001.domain.broker.result.BrokerResult;
import com.tops001.domain.broker.result.BrokerTopResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Administrator on 2016/8/2.
 */
@Path("/broker")
@Api(tags = "经纪人", description = "经纪人接口")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface IBrokerService {

    @GET
    @Path("/getBrokerList")
    @Valid
    @ApiOperation(value = "获取经纪人列表", httpMethod = "GET")
    Result<PageResult<List<BrokerResult>>> getBrokerListByCity(@BeanParam BrokerParameter brokerParameter);


    @GET
    @Path("/getTopBrokerList/")
    @Valid
    @ApiOperation(value = "获取排名前十的经纪人列表", httpMethod = "GET")
    Result<List<BrokerTopResult>> getTopBrokerList(@BeanParam BrokerTopParameter brokerTopParameter);

    @GET
    @Path("/getBrokerDetail/{brokerId}")
    @Valid
    @ApiOperation(value = "获取经纪人详情", httpMethod = "GET")
    Result<BrokerDetailResult> getBrokerDetail(@ApiParam(value = "经纪人ID", required = true)
                                               @PathParam("brokerId")Integer brokerId);
}
