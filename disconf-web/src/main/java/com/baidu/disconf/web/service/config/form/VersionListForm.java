package com.baidu.disconf.web.service.config.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * @author liaoqiqi
 * @version 2014-6-22
 */
@ApiModel(value="获取版本列表的表单",description = "获取版本列表的表单JSON")
public class VersionListForm {

    @ApiModelProperty(name="app的ID",required = true)
    @NotNull
    private Long appId;


    // 环境可以为空
    @ApiModelProperty("包含对象")
    private Long envId;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    @Override
    public String toString() {
        return "VersionListForm [appId=" + appId + ", envId=" + envId + "]";
    }

}
