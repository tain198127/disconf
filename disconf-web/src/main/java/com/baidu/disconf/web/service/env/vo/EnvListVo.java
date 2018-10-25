package com.baidu.disconf.web.service.env.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

/**
 * @author liaoqiqi
 * @version 2014-6-22
 */
@ApiModel("环境列表的视图")
public class EnvListVo {
@ApiModelProperty(value = "环境的ID",notes = "也就是env的id")
    private long id;
    @ApiModelProperty("环境的名称")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
