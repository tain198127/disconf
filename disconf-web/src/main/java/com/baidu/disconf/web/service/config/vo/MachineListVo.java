package com.baidu.disconf.web.service.config.vo;

import java.util.List;

import com.baidu.disconf.web.service.zookeeper.dto.ZkDisconfData.ZkDisconfDataItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author knightliao
 */
@ApiModel("配置信息")
public class MachineListVo {

    @ApiModelProperty("ZK配置信息")
    private List<ZkDisconfDataItem> datalist;
    @ApiModelProperty("错误数")
    private int errorNum = 0;
    @ApiModelProperty("ZK节点数")
    private int machineSize;

    public int getMachineSize() {
        return machineSize;
    }

    public void setMachineSize(int machineSize) {
        this.machineSize = machineSize;
    }

    public List<ZkDisconfDataItem> getDatalist() {
        return datalist;
    }

    public void setDatalist(List<ZkDisconfDataItem> datalist) {
        this.datalist = datalist;
    }

    public int getErrorNum() {
        return errorNum;
    }

    public void setErrorNum(int errorNum) {
        this.errorNum = errorNum;
    }

    @Override
    public String toString() {
        return "MachineListVo [datalist=" + datalist + ", errorNum=" + errorNum + ", machineSize=" + machineSize + "]";
    }

}
