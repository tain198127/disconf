package com.baidu.disconf.web.service.app.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author liaoqiqi
 * @version 2014-6-22
 */
@ApiModel(value = "App列表视图JSON")
public class AppListVo {
    @ApiModelProperty("APP的ID")
    private long id;
    @ApiModelProperty("名称")
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
