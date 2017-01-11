package com.tops001.city.service;

import com.tops001.common.BeanListUtils;
import com.tops001.core.vo.Result;
import com.tops001.city.ICityService;
import com.tops001.city.dao.ICityMapper;
import com.tops001.city.entity.City;
import com.tops001.domain.city.parameters.CityParameter;
import com.tops001.domain.city.result.CityResult;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.DefaultValue;
import java.util.ArrayList;
import java.util.List;

/**
 * Author:zhangmingqiang on 2016/8/17.
 * Date  :2016/8/17.
 * Description:
 */
@Service("cityListService")
public class CityService implements ICityService {

    @Autowired
    private ICityMapper dataMapper;

    @Override
    public Result<Boolean> setCityStatus(CityParameter cityParameter) {
        dataMapper.updateCityStatus(cityParameter);
        return Result.createSuccess("修改成功",null);
    }

    @Override
    public Result<List<CityResult>> getCityIdByName(String cityName) {

        List<City> cityList = dataMapper.selectCityByCityName(cityName);
        List<CityResult> cityResult = new ArrayList<>();

        if (cityList.size() == 0){
            return Result.createUnknowFail(2,"城市不存在");
        }
        BeanListUtils.copyProperties(cityList, cityResult, CityResult.class);

        return Result.createSuccess(cityResult);
    }

    @Override
    public Result<List<CityResult>> getOpenCity(String cityName) {
        List<City> cityList = dataMapper.selectOpenCity(cityName);
        List<CityResult> cityResult = new ArrayList<>();

        if (cityList.size() == 0){
            return Result.createUnknowFail(2,"城市不存在");
        }
        BeanListUtils.copyProperties(cityList, cityResult, CityResult.class);

        return Result.createSuccess(cityResult);
    }
}

