package com.baidu.disconf.web.service.config.form;

import com.baidu.dsp.common.form.RequestFormBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author liaoqiqi
 * @version 2014-1-24
 */
@ApiModel(value="配置表单",description = "配置表单JSON")
public class ConfForm extends RequestFormBase {

    /**
     *
     */
    private static final long serialVersionUID = 4556205917730218419L;
    @ApiModelProperty("app名称")
    private String app;
    @ApiModelProperty("maintype-媒体类型")
    private String maintype;
    @ApiModelProperty("版本")
    private String version;
    @ApiModelProperty("环境")
    private String env;

    // TODO: 2018/10/19 key表示什么，需要再梳理
    @ApiModelProperty("key唯一标识")
    private String key;

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getMaintype() {
        return maintype;
    }

    public void setMaintype(String maintype) {
        this.maintype = maintype;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "ConfForm [app=" + app + ", maintype=" + maintype + ", version=" + version + ", env=" + env + ", key=" +
                   key + "]";
    }

}
