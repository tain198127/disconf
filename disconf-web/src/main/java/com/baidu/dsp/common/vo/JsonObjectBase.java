package com.baidu.dsp.common.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.baidu.ub.common.commons.ThreadContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * JSON 基类
 *
 * @author liaoqiqi
 * @version 2013-12-3
 */
@ApiModel(value="基础对象",description = "基础对象JSON")
public class JsonObjectBase implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -8441731449894560959L;

    /**
     * 如果成功的话，数据结果
     */
    @ApiModelProperty("包含对象")
    protected Map<String, Object> message = new HashMap<String, Object>();

    public JsonObjectBase() {
        sessionId = ThreadContext.getSessionId();
    }

    /**
     * 会话ID
     */
    @ApiModelProperty("会话ID")
    private String sessionId = "";
    @ApiModelProperty("是否成功")
    protected String success = "true";

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getSessionId() {
        return sessionId;
    }

    public Map<String, Object> getMessage() {
        return message;
    }

    public void setMessage(Map<String, Object> message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "JsonObjectBase [message=" + message + ", sessionId=" + sessionId + ", success=" + success + "]";
    }

}
