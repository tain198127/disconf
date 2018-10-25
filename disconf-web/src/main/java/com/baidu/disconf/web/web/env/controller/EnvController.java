package com.baidu.disconf.web.web.env.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.disconf.web.service.env.service.EnvMgr;
import com.baidu.disconf.web.service.env.vo.EnvListVo;
import com.baidu.dsp.common.constant.WebConstants;
import com.baidu.dsp.common.controller.BaseController;
import com.baidu.dsp.common.vo.JsonObjectBase;

/**
 * @author liaoqiqi
 * @version 2014-6-16
 */
@Api("环境接口")
@Controller
@RequestMapping(WebConstants.API_PREFIX + "/env")
public class EnvController extends BaseController {

    protected static final Logger LOG = LoggerFactory.getLogger(EnvController.class);

    @Autowired
    private EnvMgr envMgr;

    /**
     * list
     *
     * @return
     */
    @ApiOperation(value = "获取列表-需要登陆",notes = "需要先登陆")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectBase list() {

        List<EnvListVo> envListVos = envMgr.getVoList();

        return buildListSuccess(envListVos, envListVos.size());
    }

}
