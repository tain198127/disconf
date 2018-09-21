package com.baidu.disconf.core.common.json;

/**
 * @author DaneBrown
 * email:tain198127@163.com
 * 用于展示列表
 **/
public class ConfiListVo {
    private boolean success = false;
    private String message = "";
    private ConfPageListVo<ClientConfListItemVo> daoPageResult = new ConfPageListVo<ClientConfListItemVo>();

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public ConfPageListVo<ClientConfListItemVo> getDaoPageResult() {
        return daoPageResult;
    }
}
