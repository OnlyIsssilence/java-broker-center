package com.tops001.city.dao;

import com.tops001.city.entity.City;
import com.tops001.domain.city.parameters.CityParameter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author:zhangmingqiang on 2016/8/17.
 * Date  :2016/8/17.
 * Description:
 */
public interface ICityMapper {
    /**
     * 根据城市ID修改该城市的接入状态
     * @param cityParameter
     */
    void updateCityStatus(CityParameter cityParameter);

    /**
     * 更具cityName模糊查询城市的ID号
     * @param cityName
     * @return
     */
    List<City> selectCityByCityName(@Param("cityName")String cityName);

    /**
     * 更具cityName模糊查询城市的ID号
     * @param cityName
     * @return
     */
    List<City> selectOpenCity(@Param("cityName")String cityName);

}
