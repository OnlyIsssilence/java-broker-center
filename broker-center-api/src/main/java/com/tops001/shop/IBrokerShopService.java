package com.tops001.shop;

import com.tops001.core.vo.Result;
import com.tops001.domain.PageResult;
import com.tops001.domain.shop.parameters.BrokerShopParameter;
import com.tops001.domain.shop.parameters.BrokerTopShopParameter;
import com.tops001.domain.shop.result.BrokerShopDetailResult;
import com.tops001.domain.shop.result.BrokerShopResult;
import com.tops001.domain.shop.result.BrokerTopShopResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Administrator on 2016/8/1.
 */
@Path("/shop")
@Api(tags = "经纪门店", description = "经纪门店接口")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface IBrokerShopService {
    @GET
    @Path("/getShopList")
    @Valid
    @ApiOperation(value = "获取门店列表", httpMethod = "GET")
    Result<PageResult<List<BrokerShopResult>>> getShopList(@BeanParam BrokerShopParameter brokerShopParameter);

    @GET
    @Path("/getTopShopList")
    @Valid
    @ApiOperation(value = "获取门店top10", httpMethod = "GET")
    Result<List<BrokerTopShopResult>> getTopShopList(@BeanParam BrokerTopShopParameter brokerTopShopParameter);



    @GET
    @Path("/getShopDetail/{shopId}")
    @Valid
    @ApiOperation(value = "获取经纪门店详情", httpMethod = "GET")
    Result<BrokerShopDetailResult> getShopDetail(@ApiParam(value = "经纪门店ID", required = true)
                                               @PathParam("shopId")Integer shopId);
}
