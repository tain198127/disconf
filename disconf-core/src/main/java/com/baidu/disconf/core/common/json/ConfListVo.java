package com.baidu.disconf.core.common.json;

import java.util.Map;

/**
 * @author DaneBrown
 * email:tain198127@163.com
 * 用于展示列表
 **/
public class ConfListVo {
    private boolean success = false;
    private Map<String,Object> message =null;
    private ConfPageListVo<ClientConfListItemVo> page = new ConfPageListVo<ClientConfListItemVo>();

    public boolean isSuccess() {
        return success;
    }

    public Map<String,Object> getMessage() {
        return message;
    }

    public ConfPageListVo<ClientConfListItemVo> getDaoPageResult() {
        return page;
    }
}
