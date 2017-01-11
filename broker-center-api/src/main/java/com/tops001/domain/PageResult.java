package com.tops001.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

/**
 * Created by Administrator on 2016/8/4.
 */

@ApiModel(
        description = "分页响应结果封装"
)
public class PageResult<T> {
    public PageResult(T items, Long count) {
        this.count = count;
        this.items = items;
    }

    @JsonProperty("Count")
    private Long count;
    @JsonProperty("Items")
    private T items;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public T getItems() {
        return items;
    }

    public void setItems(T items) {
        this.items = items;
    }

}
