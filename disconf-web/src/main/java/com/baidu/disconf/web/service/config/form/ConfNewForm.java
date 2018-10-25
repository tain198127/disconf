package com.baidu.disconf.web.service.config.form;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 新建配置文件表格
 *
 * @author liaoqiqi
 * @version 2014-7-3
 */
@ApiModel(value="新建配置项表单-BASE",description = "新建配置项表单-BASE-JSON")
public class ConfNewForm {

    @NotNull(message = "app.empty")
    @ApiModelProperty("对应APP的ID")
    private Long appId;
    public static final String APPID = "appId";

    @NotNull(message = "version.empty")
    @NotEmpty(message = "version.empty")
    @ApiModelProperty("版本")
    private String version;
    public static final String VERSION = "version";

    @NotNull(message = "env.empty")
    @ApiModelProperty("环境的ID")
    private Long envId;
    public static final String ENVID = "envId";

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    @Override
    public String toString() {
        return "ConfNewForm [appId=" + appId + ", version=" + version + ", envId=" + envId + "]";
    }

    public ConfNewForm(Long appId, String version, Long envId) {
        super();
        this.appId = appId;
        this.version = version;
        this.envId = envId;
    }

    public ConfNewForm() {
        super();
    }

}
