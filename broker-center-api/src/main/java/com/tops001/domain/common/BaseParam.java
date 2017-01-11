package com.tops001.domain.common;

import io.swagger.annotations.ApiParam;

import javax.validation.constraints.Min;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;

/**
 * Author:zhangmingqiang on 2016/8/13.
 * Date  :2016/8/13.
 * Description:
 */
public abstract class BaseParam {
    @ApiParam(value = "页码")
    @DefaultValue("1")
    @Min(1)
    @QueryParam("pageIndex")
    private Integer pageIndex;

    @ApiParam(value = "页大小")
    @DefaultValue("20")
    @QueryParam("pageSize")
    private Integer pageSize;

    private Integer startRow;

    public Integer getStartRow() {
        return Integer.valueOf((this.pageIndex.intValue() - 1) * this.pageSize.intValue());
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }
}
