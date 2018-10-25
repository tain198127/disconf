package com.baidu.disconf.web.service.app.form;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import com.baidu.dsp.common.form.RequestFormBase;

import lombok.Data;

/**
 * @author liaoqiqi
 * @version 2014-1-24
 */
@ApiModel(value = "新建表单的FORM",description = "新建表单的FORM的JSON")
@Data
public class AppNewForm extends RequestFormBase {

    /**
     *
     */
    private static final long serialVersionUID = 4329463343279659715L;

    @ApiModelProperty(name = "app名称",required = true)
    @NotNull(message = "app.empty")
    @NotEmpty(message = "app.empty")
    private String app;
    public final static String APP = "app";

    @NotNull(message = "desc.empty")
    @NotEmpty(message = "desc.empty")
    @ApiModelProperty(name = "描述",required = true)
    private String desc;

    // 邮箱
    @ApiModelProperty(name = "邮箱")
    private String emails = "";

}
