package com.baidu.disconf.web.service.config.form;

import javax.validation.constraints.NotNull;

import com.baidu.dsp.common.form.RequestListBase;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liaoqiqi
 * @version 2014-6-23
 */
@Api("读取配置列表的表单")
@Data
public class ConfListForm extends RequestListBase {

    /**
     *
     */
    private static final long serialVersionUID = -2498128894396346299L;

    @ApiModelProperty(value = "App的ID",required = true)
    @NotNull
    private Long appId;

    @ApiModelProperty(value = "版本",required = true)
    @NotNull
    private String version;
    @ApiModelProperty(value = "环境evn的ID",required = true)
    @NotNull
    private Long envId;

}
