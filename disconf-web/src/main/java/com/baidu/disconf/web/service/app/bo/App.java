package com.baidu.disconf.web.service.app.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baidu.dsp.common.dao.Columns;
import com.baidu.dsp.common.dao.DB;
import com.baidu.unbiz.common.genericdao.annotation.Column;
import com.baidu.unbiz.common.genericdao.annotation.Table;
import com.github.knightliao.apollo.db.bo.BaseObject;

/**
 * @author liaoqiqi
 * @version 2014-6-16
 */
@ApiModel("App数据库表对象")
@Table(db = DB.DB_NAME, name = "app", keyColumn = Columns.APP_ID)
public class App extends BaseObject<Long> {

    protected static final Logger LOG = LoggerFactory.getLogger(App.class);

    /**
     *
     */
    private static final long serialVersionUID = -2217832889126331664L;

    /**
     *
     */
    @ApiModelProperty("App名称字段")
    @Column(value = Columns.NAME)
    private String name;

    /**
     *
     */
    @ApiModelProperty("App描述字段")
    @Column(value = Columns.DESC)
    private String desc;

    /**
     *
     */
    @ApiModelProperty("App的通知email字段")
    @Column(value = Columns.EMAILS)
    private String emails;

    /**
     * 创建时间
     */
    @ApiModelProperty("App创建时间")
    @Column(value = Columns.CREATE_TIME)
    private String createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty("App更新时间")
    @Column(value = Columns.UPDATE_TIME)
    private String updateTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "App [name=" + name + ", desc=" + desc + ", emails=" + emails + ", createTime=" + createTime +
                   ", updateTime=" + updateTime + "]";
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

}
