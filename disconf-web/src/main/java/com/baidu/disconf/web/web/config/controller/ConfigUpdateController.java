package com.baidu.disconf.web.web.config.controller;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.baidu.disconf.web.service.config.service.ConfigMgr;
import com.baidu.disconf.web.web.config.validator.ConfigValidator;
import com.baidu.disconf.web.web.config.validator.FileUploadValidator;
import com.baidu.dsp.common.constant.WebConstants;
import com.baidu.dsp.common.controller.BaseController;
import com.baidu.dsp.common.exception.FileUploadException;
import com.baidu.dsp.common.vo.JsonObjectBase;

/**
 * 专用于配置更新、删除
 *
 * @author liaoqiqi
 * @version 2014-6-24
 */
@Api(value = "专用于配置更新、删除")
@Controller
@RequestMapping(WebConstants.API_PREFIX + "/web/config")
public class ConfigUpdateController extends BaseController {

    protected static final Logger LOG = LoggerFactory.getLogger(ConfigUpdateController.class);

    @Autowired
    private ConfigMgr configMgr;

    @Autowired
    private ConfigValidator configValidator;

    @Autowired
    private FileUploadValidator fileUploadValidator;

    /**
     * 配置项的更新
     *
     * @param configId
     * @param value
     *
     * @return
     */
    @ApiOperation(value = "配置项的更新-需要登陆",notes = "配置项的，不是配置文件，需要登陆。在BCONF中，不会获取配置项。")
    @RequestMapping(value = "/item/{configId}", method = RequestMethod.PUT)
    @ResponseBody
    public JsonObjectBase updateItem(@PathVariable long configId, String value) {

        // 业务校验
        configValidator.validateUpdateItem(configId, value);

        LOG.info("start to update config: " + configId);

        //
        // 更新, 并写入数据库
        //
        String emailNotification = "";
        emailNotification = configMgr.updateItemValue(configId, value);

        //
        // 通知ZK
        //
        configMgr.notifyZookeeper(configId);

        return buildSuccess(emailNotification);
    }

    /**
     * 配置文件的更新
     *
     * @param configId
     * @param file
     *
     * @return
     */
    @ApiOperation(value = "配置文件的更新[文件]-需要登陆",notes = "配置文件的，不是配置项的，需要登陆。以上传文本的形式")
    @ResponseBody
    @RequestMapping(value = "/file/{configId}", method = RequestMethod.POST)
    public JsonObjectBase updateFile(@PathVariable long configId, @RequestParam("myfilerar") MultipartFile file) {

        //
        // 校验
        //
        int fileSize = 1024 * 1024 * 4;
        String[] allowExtName = {".properties", ".xml"};
        fileUploadValidator.validateFile(file, fileSize, allowExtName);

        // 业务校验
        configValidator.validateUpdateFile(configId, file.getOriginalFilename());

        //
        // 更新
        //
        String emailNotification = "";
        try {

            String str = new String(file.getBytes(), "UTF-8");
            LOG.info("receive file: " + str);

            emailNotification = configMgr.updateItemValue(configId, str);
            LOG.info("update " + configId + " ok");

        } catch (Exception e) {

            LOG.error(e.toString());
            throw new FileUploadException("upload file error", e);
        }

        //
        // 通知ZK
        //
        configMgr.notifyZookeeper(configId);

        return buildSuccess(emailNotification);
    }

    /**
     * 配置文件的更新(文本修改)
     *
     * @param configId
     * @param fileContent
     *
     * @return
     */
    @ApiOperation(value = "配置项的更新[文本]-需要登陆",notes = "配置项的，不是配置文件，需要登陆，以文本的形式修改")
    @ResponseBody
    @RequestMapping(value = "/filetext/{configId}", method = RequestMethod.PUT)
    public JsonObjectBase updateFileWithText(@PathVariable long configId, @NotNull String fileContent) {

        //
        // 更新
        //
        String emailNotification = "";
        try {

            String str = new String(fileContent.getBytes(), "UTF-8");
            LOG.info("receive file: " + str);

            emailNotification = configMgr.updateItemValue(configId, str);
            LOG.info("update " + configId + " ok");

        } catch (Exception e) {

            throw new FileUploadException("upload.file.error", e);
        }

        //
        // 通知ZK
        //
        configMgr.notifyZookeeper(configId);

        return buildSuccess(emailNotification);
    }

    /**
     * delete
     *
     * @return
     */
    @ApiOperation(value = "根据配置ID删除配置-需要登陆",notes = "不区分配置项还是配置文件")
    @RequestMapping(value = "/{configId}", method = RequestMethod.DELETE)
    @ResponseBody
    public JsonObjectBase delete(@PathVariable long configId) {

        configValidator.validateDelete(configId);

        configMgr.delete(configId);

        return buildSuccess("删除成功");
    }
}
