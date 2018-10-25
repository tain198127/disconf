package com.baidu.ub.common.db;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.List;

/**
 * 页面返回结果
 *
 * @param <T>
 *
 * @author liaoqiqi
 * @version 2014-2-20
 */
@ApiModel(value = "列表封装类",description = "用于将各种列表封装为统一的对象")
public class DaoPageResult<T> {

    @ApiModelProperty("具体列表内容")
    private List<T> result = new ArrayList<T>();
    @ApiModelProperty("总条数")
    private int totalCount = -1;

    // 统计结果
    @ApiModelProperty("统计结果")
    private T footResult;

    @Override
    public String toString() {
        return "DaoPageResult [result=" + result + ", totalCount=" + totalCount + ", footResult=" + footResult + "]";
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public T getFootResult() {
        return footResult;
    }

    public void setFootResult(T footResult) {
        this.footResult = footResult;
    }

}
