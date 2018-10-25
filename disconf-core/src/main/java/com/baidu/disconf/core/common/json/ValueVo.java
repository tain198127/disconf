package com.baidu.disconf.core.common.json;

import com.baidu.disconf.core.common.constants.Constants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 通用的Value Vo
 *
 * @author liaoqiqi
 * @version 2014-6-10
 */
@ApiModel(value="通用值对象",description = "通用值对象JSON")
public class ValueVo {

    // 是否存在此KEy
    @ApiModelProperty("是否存在此key")
    private Integer status = Constants.OK;

    //
    @ApiModelProperty("消息")
    private String message = "";

    //
    @ApiModelProperty("值")
    private String value = "";

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ValueVo [status=" + status + ", message=" + message + ", value=" + value + "]";
    }

}
