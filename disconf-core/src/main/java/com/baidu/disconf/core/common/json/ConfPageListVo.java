package com.baidu.disconf.core.common.json;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DaneBrown
 * email:tain198127@163.com
 **/
public class ConfPageListVo<T> {
    private List<T> result = new ArrayList<T>();

    private int totalCount = -1;

    // 统计结果
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
