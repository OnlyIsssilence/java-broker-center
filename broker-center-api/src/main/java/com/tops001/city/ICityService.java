package com.tops001.city;

import com.tops001.core.vo.Result;
import com.tops001.domain.city.parameters.CityParameter;
import com.tops001.domain.city.result.CityResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Author:zhangmingqiang on 2016/8/17.
 * Date  :2016/8/17.
 * Description:
 */

@Path("/city")
@Api(tags = "城市列表数据处理", description = "城市列表数据接口")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface ICityService {

    @POST
    @Path("/setCityStatus")
    @Valid
    @ApiOperation(value = "设置城市公司开通与否", httpMethod = "POST")
    Result<Boolean> setCityStatus(@BeanParam CityParameter cityParameter);

    @GET
    @Path("/getCityIdByName")
    @Valid
    @ApiOperation(value = "后台使用：根据城市名称模糊查询城市列表来获取城市ID", httpMethod = "GET")
    Result<List<CityResult>> getCityIdByName(@ApiParam(value = "城市名称", required = true)
                                               @DefaultValue("")
                                               @QueryParam("cityName")String cityName);


    @GET
    @Path("/getOpenCity")
    @Valid
    @ApiOperation(value = "前端使用：根据城市名称模糊查询城市列表来获取城市ID", httpMethod = "GET")
    Result<List<CityResult>> getOpenCity(@ApiParam(value = "城市名称")
                                                   @DefaultValue("")
                                                   @QueryParam("cityName")String cityName);
}
