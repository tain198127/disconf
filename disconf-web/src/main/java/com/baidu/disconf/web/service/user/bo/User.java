package com.baidu.disconf.web.service.user.bo;

import com.baidu.dsp.common.dao.Columns;
import com.baidu.dsp.common.dao.DB;
import com.baidu.unbiz.common.genericdao.annotation.Column;
import com.baidu.unbiz.common.genericdao.annotation.Table;
import com.github.knightliao.apollo.db.bo.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户表
 *
 * @author liaoqiqi
 * @version 2013-11-28
 */
@ApiModel(value="用户",description = "用户表")
@Table(db = DB.DB_NAME, name = "user", keyColumn = Columns.USER_ID)
public class User extends BaseObject<Long> {

    private static final long serialVersionUID = 1L;

    // 唯一
    @ApiModelProperty("用户-登录名")
    @Column(value = Columns.NAME)
    private String name;

    // token
    @ApiModelProperty("用户-token")
    @Column(value = Columns.TOKEN)
    private String token;

    // 密码
    @ApiModelProperty("用户-密码")
    @Column(value = Columns.PASSWORD)
    private String password;

    //
    @ApiModelProperty("用户-所属APP")
    @Column(value = Columns.OWNAPPS)
    private String ownApps;

    /**
     * 角色ID
     */
    @ApiModelProperty("用户-角色")
    @Column(value = Columns.ROLE_ID)
    private int roleId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOwnApps() {
        return ownApps;
    }

    public void setOwnApps(String ownApps) {
        this.ownApps = ownApps;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "User{" +
                   "name='" + name + '\'' +
                   ", token='" + token + '\'' +
                   ", password='" + password + '\'' +
                   ", ownApps='" + ownApps + '\'' +
                   ", roleId=" + roleId +
                   '}';
    }
}
