package com.baidu.disconf.client.fetcher;

import com.baidu.disconf.client.config.ConfigMgr;
import com.baidu.disconf.client.config.DisClientConfig;
import com.baidu.disconf.client.config.DisClientSysConfig;
import com.baidu.disconf.client.fetcher.impl.FetcherMgrImpl;
import com.baidu.disconf.core.common.restful.RestfulFactory;
import com.baidu.disconf.core.common.restful.RestfulMgr;
import com.baidu.disconf.core.common.utils.OsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 抓取器工厂
 *
 * @author liaoqiqi
 * @version 2014-7-29
 */
public class FetcherFactory {

    protected static final Logger LOGGER = LoggerFactory.getLogger(FetcherFactory.class);

    /**
     * 获取抓取器实例，记得释放资源, 它依赖Conf模块
     */
    public static FetcherMgr getFetcherMgr() throws Exception {

        if (!ConfigMgr.isInit()) {
            throw new Exception("ConfigMgr should be init before FetcherFactory.getFetcherMgr");
        }

        // 获取一个默认的抓取器
        RestfulMgr restfulMgr = RestfulFactory.getRestfulMgrNomal();

        LOGGER.info("CONF_SERVER_URL_RETRY_TIMES:{}\n" +
                "userDefineDownloadDir:{}\n"+
                "LOCAL_DOWNLOAD_DIR:{}\n",
                DisClientConfig.getInstance().CONF_SERVER_URL_RETRY_TIMES,
                OsUtil.getRealConfigDir(DisClientConfig.getInstance().userDefineDownloadDir),
                OsUtil.getRealConfigDir(DisClientSysConfig.getInstance().LOCAL_DOWNLOAD_DIR)
        );

        FetcherMgr fetcherMgr =
                new FetcherMgrImpl(restfulMgr, DisClientConfig.getInstance().CONF_SERVER_URL_RETRY_TIMES,
                        DisClientConfig.getInstance().confServerUrlRetrySleepSeconds,
                        DisClientConfig.getInstance().enableLocalDownloadDirInClassPath,
                        OsUtil.getRealConfigDir(DisClientConfig.getInstance().userDefineDownloadDir),
                        OsUtil.getRealConfigDir(DisClientSysConfig.getInstance().LOCAL_DOWNLOAD_DIR),
                        DisClientConfig.getInstance().getHostList());

        return fetcherMgr;
    }
}
