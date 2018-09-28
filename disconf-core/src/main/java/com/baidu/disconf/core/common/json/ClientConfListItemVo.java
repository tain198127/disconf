package com.baidu.disconf.core.common.json;

/**
 * @author DaneBrown
 * email:tain198127@163.com
 **/
public class ClientConfListItemVo {

    private Long configId;

    private String appName;
    private Long appId;
    private String version;
    private Long envId;
    private String envName;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    private Integer status;

    public Integer getType() {
        return type;
    }

    private Integer type;

    private String name;

    private String value;

    private String createTime;

    private String modifyTime;

    //
    // zk data
    //
    private int machineSize;
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


    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public int getErrorNum() {
        return errorNum;
    }

    public void setErrorNum(int errorNum) {
        this.errorNum = errorNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String key) {
        this.name = key;
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

    public int getMachineSize() {
        return machineSize;
    }

    public void setMachineSize(int machineSize) {
        this.machineSize = machineSize;
    }


    @Override
    public String toString() {
        return "ConfListVo [configId=" + configId + ", appName=" + appName + ", appId=" + appId + ", version=" +
                version + ", envId=" + envId + ", envName=" + envName + ", type=" + type  +
                ", name=" + name + ", value=" + value + ", createTime=" + createTime + ", modifyTime=" + modifyTime +
                "]";
    }

}
