package com.baidu.disconf.web.service.config.vo;

import java.util.List;

import com.baidu.disconf.web.service.zookeeper.dto.ZkDisconfData.ZkDisconfDataItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author liaoqiqi
 * @version 2014-6-23
 */
@ApiModel(value = "配置信息列表视图",description = "用于后台管理列表视图")
public class ConfListVo {
@ApiModelProperty("配置ID")
    private Long configId;
    @ApiModelProperty("app名称")
    private String appName;
    @ApiModelProperty("app的ID")
    private Long appId;
    @ApiModelProperty("版本")
    private String version;
    @ApiModelProperty("环境ID")
    private Long envId;
    @ApiModelProperty("环境名称")
    private String envName;
    @ApiModelProperty(value="类型，1为配置项，0为文件",notes = "请不要使用配置项，BCONF客户端不会读取配置项内容")
    private String type;
    @ApiModelProperty("类型ID")
    private Integer typeId;
    @ApiModelProperty("唯一标示")
    private String key;
    @ApiModelProperty("值")
    private String value;
    @ApiModelProperty("创建时间")
    private String createTime;
    @ApiModelProperty("修改时间")
    private String modifyTime;

    //
    // zk data
    //
    private int machineSize;
    private List<ZkDisconfDataItem> machineList;
    private int errorNum = 0;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

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

    public String getType() {
        return type;
    }

    public String getEnvName() {
        return envName;
    }

    public int getErrorNum() {
        return errorNum;
    }

    public void setErrorNum(int errorNum) {
        this.errorNum = errorNum;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getConfigId() {
        return configId;
    }

    public void setConfigId(Long configId) {
        this.configId = configId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public int getMachineSize() {
        return machineSize;
    }

    public void setMachineSize(int machineSize) {
        this.machineSize = machineSize;
    }

    public List<ZkDisconfDataItem> getMachineList() {
        return machineList;
    }

    public void setMachineList(List<ZkDisconfDataItem> machineList) {
        this.machineList = machineList;
    }

    @Override
    public String toString() {
        return "ConfListVo [configId=" + configId + ", appName=" + appName + ", appId=" + appId + ", version=" +
                   version + ", envId=" + envId + ", envName=" + envName + ", type=" + type + ", typeId=" + typeId +
                   ", key=" + key + ", value=" + value + ", createTime=" + createTime + ", modifyTime=" + modifyTime +
                   "]";
    }

}
