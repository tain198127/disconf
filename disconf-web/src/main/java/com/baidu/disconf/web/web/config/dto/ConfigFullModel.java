package com.baidu.disconf.web.web.config.dto;

import com.baidu.disconf.web.service.app.bo.App;
import com.baidu.disconf.web.service.env.bo.Env;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author liaoqiqi
 * @version 2014-9-11
 */
@ApiModel("整体信息")
public class ConfigFullModel {

    @ApiModelProperty("app对象")
    private App app;
    @ApiModelProperty("环境对象")
    private Env env;
    @ApiModelProperty("版本")
    private String version;
    @ApiModelProperty("唯一标识")
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public Env getEnv() {
        return env;
    }

    public void setEnv(Env env) {
        this.env = env;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ConfigFullModel(App app, Env env, String version, String key) {
        super();
        this.app = app;
        this.env = env;
        this.version = version;
        this.key = key;
    }
}
